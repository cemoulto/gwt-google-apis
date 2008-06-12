/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxsearch.client;

import com.google.gwt.ajaxsearch.jsio.client.JSOpaque;

/**
 * Used with {@link ImageSearch#setSafeSearch(SafeSearchValue)} to
 * control the types of results displayed.
 */
public enum SafeSearchValue {
  /**
   * Apply strict filtering for both explicit text and explicit images.
   */
  STRICT("STRICT"), 
  
  /**
   * Apply filtering for explicit images (the default behavior).
   */
  MODERATE("MODERATE"),
  
  /**
   * Do not apply safe search filtering.
   */
  OFF("OFF");

  private final JSOpaque value;

  private SafeSearchValue(String type) {
    value = new JSOpaque("$wnd.GSearch.SAFESEARCH_" + type);
  }

  JSOpaque getValue() {
    return value;
  }
}