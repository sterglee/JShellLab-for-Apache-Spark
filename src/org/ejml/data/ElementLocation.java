/*
 * Copyright (c) 2020, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.data;

// import lombok.Data;

/**
 * The row and column of an element in a Matrix
 *
 * @author Peter Abeles
 */
// @Data
public class ElementLocation {
    /** Row coordinate of an element */
    public int row;

    /** Column coordinate of an element */
    public int col;

    public ElementLocation() {}

    public ElementLocation( int row, int col ) {
        this.row = row;
        this.col = col;
    }

    public void set( ElementLocation loc ) {
        this.row = loc.row;
        this.col = loc.col;
    }

    public void set( int row, int col ) {
        this.row = row;
        this.col = col;
    }
}
