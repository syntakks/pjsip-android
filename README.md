# pjsip-droid
Starter Files for a simple PJSIP Android App

Below are instructions of how I built the starter files if you want to do it yourself. 

This guide is for mac but should be about the same for linux. 

1. Download Android SDK (Android Studio)

2. Download Android NDK https://developer.android.com/ndk

3. Using Homebrew install Swig. (brew install swig)

4. Check out the pjproject from their SVN repo. (https://svn.pjsip.org/repos/pjproject/trunk) 

5. Create a config_site.h file with the following:
```
/* Activate Android specific settings in the 'config_site_sample.h' */
#define PJ_CONFIG_ANDROID 1
// Uncomment to get minimum footprint (suitable for 1-2 concurrent calls only)
//#define PJ_CONFIG_MINIMAL_SIZE

// Uncomment to get maximum performance
//#define PJ_CONFIG_MAXIMUM_SPEED

#include <pj/config_site_sample.h> 
```

6. Place your new config_site.h file in pjproject/pjlib/include/pj/
    (I just cd to the directory and create it with: $nano config_site.h)

7. Create environment variable for NDK Path:
    cd /path/to/your/pjsip/dir
    export ANDROID_NDK_ROOT=/path_to_android_ndk_dir 

8. Build PJSIP:
    cd /path/to/your/pjsip/dir
    ./configure-android
    make dep && make clean && make

    This build should create the ARM 64 build by default. If you need to specify the build manually see #9. You will need to clean up the builds in between each subsequent build.

9. Build for specific architecture: (First clean up the old build)
    $ cd /path/to/your/pjsip/dir
    $ make clean

    # cleanup pjsua sample app
    $ cd pjsip-apps/src/pjsua/android/jni
    $ make clean

    # also cleanup pjsua2 sample app (SWIG)
    $ cd /path/to/your/pjsip/dir
    $ cd pjsip-apps/src/swig
    $ make clean

    (Then specify the architecture target) :
    cd /path/to/your/pjsip/dir 
    $TARGET_ABI=arm64-v8a ./configure-android --use-ndk-cflags

10. Build the sample application (Swig):
    Make sure SWIG is in the build environment PATH.

    $ cd /path/to/your/pjsip/dir
    $ cd pjsip-apps/src/swig
    $ make

    This step should produce:
    native library libpjsua2.so in pjsip-apps/src/swig/java/android/app/src/main/jniLibs/armeabi
    note: if you are building for other target ABI, you'll need to manually move libpjsua2.so to the appropriate target ABI directory, e.g: jniLibs/armeabi-v7a, please check ​here for target ABI directory names.

11. Create your Anroid Project (In it's own directory) and copy files over:
    Get pjsua2 Java interface and native library from pjsua2 sample application:
    Copy pjsua2 Java interface files from pjsip-apps/src/swig/java/android/app/src/main/java to your project's app/src/main/java folder, e.g:

    $ cd $YOUR_PROJECT_DIR/app/src/main/java
    $ cp -r $PJSIP_DIR/pjsip-apps/src/swig/java/android/app/src/main/java .

    # Cleanup excess pjsua2 application sources.
    $ rm -r org/pjsip/pjsua2/app

    Copy native library libpjsua2.so from pjsip-apps/src/swig/java/android/app/src/main/jniLibs to your project's app/src/main/jniLibs folder:

    $ cd $YOUR_PROJECT_DIR/app/src/main/jniLibs
    $ cp -r $PJSIP_DIR/{pjsip-apps/src/swig/java/android/app/src/main/jniLibs.

12. Start building your android application! See the docs for reference here: https://www.pjsip.org/docs/book-latest/html/index.html
    See android app for example. 

13. PERMISSIONS
    Make sure to add the following permissions to your AndroidManifest.xml
    ```xml
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    ```
14. ERRORS
    If you are hitting errors building the sample swig project, you may have closed your terminal and lost your environment vairable for ANDROID_NDK_ROOT. Go back to the root pjproject directory and redeclare it. 
    export ANDROID_NDK_ROOT=/path_to_android_ndk_dir 

