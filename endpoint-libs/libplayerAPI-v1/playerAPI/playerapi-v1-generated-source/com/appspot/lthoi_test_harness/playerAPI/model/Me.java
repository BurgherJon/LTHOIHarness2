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
 * Model definition for Me.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the playerAPI. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Me extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fname;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linitial;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lname;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer losses;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pushes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double winnings;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer wins;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public Me setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFname() {
    return fname;
  }

  /**
   * @param fname fname or {@code null} for none
   */
  public Me setFname(java.lang.String fname) {
    this.fname = fname;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Me setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLinitial() {
    return linitial;
  }

  /**
   * @param linitial linitial or {@code null} for none
   */
  public Me setLinitial(java.lang.String linitial) {
    this.linitial = linitial;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLname() {
    return lname;
  }

  /**
   * @param lname lname or {@code null} for none
   */
  public Me setLname(java.lang.String lname) {
    this.lname = lname;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLosses() {
    return losses;
  }

  /**
   * @param losses losses or {@code null} for none
   */
  public Me setLosses(java.lang.Integer losses) {
    this.losses = losses;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPushes() {
    return pushes;
  }

  /**
   * @param pushes pushes or {@code null} for none
   */
  public Me setPushes(java.lang.Integer pushes) {
    this.pushes = pushes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getWinnings() {
    return winnings;
  }

  /**
   * @param winnings winnings or {@code null} for none
   */
  public Me setWinnings(java.lang.Double winnings) {
    this.winnings = winnings;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWins() {
    return wins;
  }

  /**
   * @param wins wins or {@code null} for none
   */
  public Me setWins(java.lang.Integer wins) {
    this.wins = wins;
    return this;
  }

  @Override
  public Me set(String fieldName, Object value) {
    return (Me) super.set(fieldName, value);
  }

  @Override
  public Me clone() {
    return (Me) super.clone();
  }

}
