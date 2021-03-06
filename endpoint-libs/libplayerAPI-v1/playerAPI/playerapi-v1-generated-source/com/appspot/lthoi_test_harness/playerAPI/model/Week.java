/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2016-02-18 22:11:37 UTC)
 * on 2016-03-22 at 22:34:36 UTC 
 * Modify at your own risk.
 */

package com.appspot.lthoi_test_harness.playerAPI.model;

/**
 * Model definition for Week.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the playerAPI. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Week extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("long_Name")
  private java.lang.String longName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer number;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer season;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("short_Name")
  private java.lang.String shortName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime start;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLongName() {
    return longName;
  }

  /**
   * @param longName longName or {@code null} for none
   */
  public Week setLongName(java.lang.String longName) {
    this.longName = longName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumber() {
    return number;
  }

  /**
   * @param number number or {@code null} for none
   */
  public Week setNumber(java.lang.Integer number) {
    this.number = number;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSeason() {
    return season;
  }

  /**
   * @param season season or {@code null} for none
   */
  public Week setSeason(java.lang.Integer season) {
    this.season = season;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getShortName() {
    return shortName;
  }

  /**
   * @param shortName shortName or {@code null} for none
   */
  public Week setShortName(java.lang.String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStart() {
    return start;
  }

  /**
   * @param start start or {@code null} for none
   */
  public Week setStart(com.google.api.client.util.DateTime start) {
    this.start = start;
    return this;
  }

  @Override
  public Week set(String fieldName, Object value) {
    return (Week) super.set(fieldName, value);
  }

  @Override
  public Week clone() {
    return (Week) super.clone();
  }

}
