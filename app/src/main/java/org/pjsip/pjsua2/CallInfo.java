/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class CallInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CallInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CallInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_CallInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    pjsua2JNI.CallInfo_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return pjsua2JNI.CallInfo_id_get(swigCPtr, this);
  }

  public void setRole(int value) {
    pjsua2JNI.CallInfo_role_set(swigCPtr, this, value);
  }

  public int getRole() {
    return pjsua2JNI.CallInfo_role_get(swigCPtr, this);
  }

  public void setAccId(int value) {
    pjsua2JNI.CallInfo_accId_set(swigCPtr, this, value);
  }

  public int getAccId() {
    return pjsua2JNI.CallInfo_accId_get(swigCPtr, this);
  }

  public void setLocalUri(String value) {
    pjsua2JNI.CallInfo_localUri_set(swigCPtr, this, value);
  }

  public String getLocalUri() {
    return pjsua2JNI.CallInfo_localUri_get(swigCPtr, this);
  }

  public void setLocalContact(String value) {
    pjsua2JNI.CallInfo_localContact_set(swigCPtr, this, value);
  }

  public String getLocalContact() {
    return pjsua2JNI.CallInfo_localContact_get(swigCPtr, this);
  }

  public void setRemoteUri(String value) {
    pjsua2JNI.CallInfo_remoteUri_set(swigCPtr, this, value);
  }

  public String getRemoteUri() {
    return pjsua2JNI.CallInfo_remoteUri_get(swigCPtr, this);
  }

  public void setRemoteContact(String value) {
    pjsua2JNI.CallInfo_remoteContact_set(swigCPtr, this, value);
  }

  public String getRemoteContact() {
    return pjsua2JNI.CallInfo_remoteContact_get(swigCPtr, this);
  }

  public void setCallIdString(String value) {
    pjsua2JNI.CallInfo_callIdString_set(swigCPtr, this, value);
  }

  public String getCallIdString() {
    return pjsua2JNI.CallInfo_callIdString_get(swigCPtr, this);
  }

  public void setSetting(CallSetting value) {
    pjsua2JNI.CallInfo_setting_set(swigCPtr, this, CallSetting.getCPtr(value), value);
  }

  public CallSetting getSetting() {
    long cPtr = pjsua2JNI.CallInfo_setting_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CallSetting(cPtr, false);
  }

  public void setState(int value) {
    pjsua2JNI.CallInfo_state_set(swigCPtr, this, value);
  }

  public int getState() {
    return pjsua2JNI.CallInfo_state_get(swigCPtr, this);
  }

  public void setStateText(String value) {
    pjsua2JNI.CallInfo_stateText_set(swigCPtr, this, value);
  }

  public String getStateText() {
    return pjsua2JNI.CallInfo_stateText_get(swigCPtr, this);
  }

  public void setLastStatusCode(int value) {
    pjsua2JNI.CallInfo_lastStatusCode_set(swigCPtr, this, value);
  }

  public int getLastStatusCode() {
    return pjsua2JNI.CallInfo_lastStatusCode_get(swigCPtr, this);
  }

  public void setLastReason(String value) {
    pjsua2JNI.CallInfo_lastReason_set(swigCPtr, this, value);
  }

  public String getLastReason() {
    return pjsua2JNI.CallInfo_lastReason_get(swigCPtr, this);
  }

  public void setMedia(CallMediaInfoVector value) {
    pjsua2JNI.CallInfo_media_set(swigCPtr, this, CallMediaInfoVector.getCPtr(value), value);
  }

  public CallMediaInfoVector getMedia() {
    long cPtr = pjsua2JNI.CallInfo_media_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CallMediaInfoVector(cPtr, false);
  }

  public void setProvMedia(CallMediaInfoVector value) {
    pjsua2JNI.CallInfo_provMedia_set(swigCPtr, this, CallMediaInfoVector.getCPtr(value), value);
  }

  public CallMediaInfoVector getProvMedia() {
    long cPtr = pjsua2JNI.CallInfo_provMedia_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CallMediaInfoVector(cPtr, false);
  }

  public void setConnectDuration(TimeVal value) {
    pjsua2JNI.CallInfo_connectDuration_set(swigCPtr, this, TimeVal.getCPtr(value), value);
  }

  public TimeVal getConnectDuration() {
    long cPtr = pjsua2JNI.CallInfo_connectDuration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeVal(cPtr, false);
  }

  public void setTotalDuration(TimeVal value) {
    pjsua2JNI.CallInfo_totalDuration_set(swigCPtr, this, TimeVal.getCPtr(value), value);
  }

  public TimeVal getTotalDuration() {
    long cPtr = pjsua2JNI.CallInfo_totalDuration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeVal(cPtr, false);
  }

  public void setRemOfferer(boolean value) {
    pjsua2JNI.CallInfo_remOfferer_set(swigCPtr, this, value);
  }

  public boolean getRemOfferer() {
    return pjsua2JNI.CallInfo_remOfferer_get(swigCPtr, this);
  }

  public void setRemAudioCount(long value) {
    pjsua2JNI.CallInfo_remAudioCount_set(swigCPtr, this, value);
  }

  public long getRemAudioCount() {
    return pjsua2JNI.CallInfo_remAudioCount_get(swigCPtr, this);
  }

  public void setRemVideoCount(long value) {
    pjsua2JNI.CallInfo_remVideoCount_set(swigCPtr, this, value);
  }

  public long getRemVideoCount() {
    return pjsua2JNI.CallInfo_remVideoCount_get(swigCPtr, this);
  }

  public CallInfo() {
    this(pjsua2JNI.new_CallInfo(), true);
  }

}
