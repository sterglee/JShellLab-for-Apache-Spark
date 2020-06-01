/*
 * Copyright (c) 2009-2018, Peter Abeles. All Rights Reserved.
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

package org.ejml.dense.row.misc;

import org.ejml.UtilEjml;
import org.ejml.data.FMatrix1Row;


/**
 * Performs an unrolled lower cholesky decomposition for small matrices.
 * 
 * Code auto generated by GenerateUnrolledCholesky
 * 
 * @author Peter Abeles
 */
public class UnrolledCholesky_FDRM {
    
    public static final int MAX = 7;
    public static boolean lower( FMatrix1Row A , FMatrix1Row L ) {
        switch( A.numRows ) {
            case 1: return lower1(A,L);
            case 2: return lower2(A,L);
            case 3: return lower3(A,L);
            case 4: return lower4(A,L);
            case 5: return lower5(A,L);
            case 6: return lower6(A,L);
            case 7: return lower7(A,L);
            default: return false;
        }
    }

    public static boolean upper( FMatrix1Row A , FMatrix1Row L ) {
        switch( A.numRows ) {
            case 1: return upper1(A,L);
            case 2: return upper2(A,L);
            case 3: return upper3(A,L);
            case 4: return upper4(A,L);
            case 5: return upper5(A,L);
            case 6: return upper6(A,L);
            case 7: return upper7(A,L);
            default: return false;
        }
    }

    public static boolean lower1( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];

        L.data[0]  = (float)Math.sqrt(a11);
        return !UtilEjml.isUncountable(L.data[0]);
    }

    public static boolean lower2( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a21 = data[ 2 ];
        float a22 = data[ 3 ];

        L.data[0] = a11 = (float)Math.sqrt(a11);
        L.data[1] = 0;
        L.data[2] = a21 = (a21)/a11;
        L.data[3]  = (float)Math.sqrt(a22-a21*a21);
        return !UtilEjml.isUncountable(L.data[3]);
    }

    public static boolean lower3( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a21 = data[ 3 ];
        float a22 = data[ 4 ];
        float a31 = data[ 6 ];
        float a32 = data[ 7 ];
        float a33 = data[ 8 ];

        L.data[0] = a11 = (float)Math.sqrt(a11);
        L.data[1] = 0;
        L.data[2] = 0;
        L.data[3] = a21 = (a21)/a11;
        L.data[4] = a22 = (float)Math.sqrt(a22-a21*a21);
        L.data[5] = 0;
        L.data[6] = a31 = (a31)/a11;
        L.data[7] = a32 = (a32-a31*a21)/a22;
        L.data[8]  = (float)Math.sqrt(a33-a31*a31-a32*a32);
        return !UtilEjml.isUncountable(L.data[8]);
    }

    public static boolean lower4( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a21 = data[ 4 ];
        float a22 = data[ 5 ];
        float a31 = data[ 8 ];
        float a32 = data[ 9 ];
        float a33 = data[ 10 ];
        float a41 = data[ 12 ];
        float a42 = data[ 13 ];
        float a43 = data[ 14 ];
        float a44 = data[ 15 ];

        L.data[0] = a11 = (float)Math.sqrt(a11);
        L.data[1] = 0;
        L.data[2] = 0;
        L.data[3] = 0;
        L.data[4] = a21 = (a21)/a11;
        L.data[5] = a22 = (float)Math.sqrt(a22-a21*a21);
        L.data[6] = 0;
        L.data[7] = 0;
        L.data[8] = a31 = (a31)/a11;
        L.data[9] = a32 = (a32-a31*a21)/a22;
        L.data[10] = a33 = (float)Math.sqrt(a33-a31*a31-a32*a32);
        L.data[11] = 0;
        L.data[12] = a41 = (a41)/a11;
        L.data[13] = a42 = (a42-a41*a21)/a22;
        L.data[14] = a43 = (a43-a41*a31-a42*a32)/a33;
        L.data[15]  = (float)Math.sqrt(a44-a41*a41-a42*a42-a43*a43);
        return !UtilEjml.isUncountable(L.data[15]);
    }

    public static boolean lower5( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a21 = data[ 5 ];
        float a22 = data[ 6 ];
        float a31 = data[ 10 ];
        float a32 = data[ 11 ];
        float a33 = data[ 12 ];
        float a41 = data[ 15 ];
        float a42 = data[ 16 ];
        float a43 = data[ 17 ];
        float a44 = data[ 18 ];
        float a51 = data[ 20 ];
        float a52 = data[ 21 ];
        float a53 = data[ 22 ];
        float a54 = data[ 23 ];
        float a55 = data[ 24 ];

        L.data[0] = a11 = (float)Math.sqrt(a11);
        L.data[1] = 0;
        L.data[2] = 0;
        L.data[3] = 0;
        L.data[4] = 0;
        L.data[5] = a21 = (a21)/a11;
        L.data[6] = a22 = (float)Math.sqrt(a22-a21*a21);
        L.data[7] = 0;
        L.data[8] = 0;
        L.data[9] = 0;
        L.data[10] = a31 = (a31)/a11;
        L.data[11] = a32 = (a32-a31*a21)/a22;
        L.data[12] = a33 = (float)Math.sqrt(a33-a31*a31-a32*a32);
        L.data[13] = 0;
        L.data[14] = 0;
        L.data[15] = a41 = (a41)/a11;
        L.data[16] = a42 = (a42-a41*a21)/a22;
        L.data[17] = a43 = (a43-a41*a31-a42*a32)/a33;
        L.data[18] = a44 = (float)Math.sqrt(a44-a41*a41-a42*a42-a43*a43);
        L.data[19] = 0;
        L.data[20] = a51 = (a51)/a11;
        L.data[21] = a52 = (a52-a51*a21)/a22;
        L.data[22] = a53 = (a53-a51*a31-a52*a32)/a33;
        L.data[23] = a54 = (a54-a51*a41-a52*a42-a53*a43)/a44;
        L.data[24]  = (float)Math.sqrt(a55-a51*a51-a52*a52-a53*a53-a54*a54);
        return !UtilEjml.isUncountable(L.data[24]);
    }

    public static boolean lower6( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a21 = data[ 6 ];
        float a22 = data[ 7 ];
        float a31 = data[ 12 ];
        float a32 = data[ 13 ];
        float a33 = data[ 14 ];
        float a41 = data[ 18 ];
        float a42 = data[ 19 ];
        float a43 = data[ 20 ];
        float a44 = data[ 21 ];
        float a51 = data[ 24 ];
        float a52 = data[ 25 ];
        float a53 = data[ 26 ];
        float a54 = data[ 27 ];
        float a55 = data[ 28 ];
        float a61 = data[ 30 ];
        float a62 = data[ 31 ];
        float a63 = data[ 32 ];
        float a64 = data[ 33 ];
        float a65 = data[ 34 ];
        float a66 = data[ 35 ];

        L.data[0] = a11 = (float)Math.sqrt(a11);
        L.data[1] = 0;
        L.data[2] = 0;
        L.data[3] = 0;
        L.data[4] = 0;
        L.data[5] = 0;
        L.data[6] = a21 = (a21)/a11;
        L.data[7] = a22 = (float)Math.sqrt(a22-a21*a21);
        L.data[8] = 0;
        L.data[9] = 0;
        L.data[10] = 0;
        L.data[11] = 0;
        L.data[12] = a31 = (a31)/a11;
        L.data[13] = a32 = (a32-a31*a21)/a22;
        L.data[14] = a33 = (float)Math.sqrt(a33-a31*a31-a32*a32);
        L.data[15] = 0;
        L.data[16] = 0;
        L.data[17] = 0;
        L.data[18] = a41 = (a41)/a11;
        L.data[19] = a42 = (a42-a41*a21)/a22;
        L.data[20] = a43 = (a43-a41*a31-a42*a32)/a33;
        L.data[21] = a44 = (float)Math.sqrt(a44-a41*a41-a42*a42-a43*a43);
        L.data[22] = 0;
        L.data[23] = 0;
        L.data[24] = a51 = (a51)/a11;
        L.data[25] = a52 = (a52-a51*a21)/a22;
        L.data[26] = a53 = (a53-a51*a31-a52*a32)/a33;
        L.data[27] = a54 = (a54-a51*a41-a52*a42-a53*a43)/a44;
        L.data[28] = a55 = (float)Math.sqrt(a55-a51*a51-a52*a52-a53*a53-a54*a54);
        L.data[29] = 0;
        L.data[30] = a61 = (a61)/a11;
        L.data[31] = a62 = (a62-a61*a21)/a22;
        L.data[32] = a63 = (a63-a61*a31-a62*a32)/a33;
        L.data[33] = a64 = (a64-a61*a41-a62*a42-a63*a43)/a44;
        L.data[34] = a65 = (a65-a61*a51-a62*a52-a63*a53-a64*a54)/a55;
        L.data[35]  = (float)Math.sqrt(a66-a61*a61-a62*a62-a63*a63-a64*a64-a65*a65);
        return !UtilEjml.isUncountable(L.data[35]);
    }

    public static boolean lower7( FMatrix1Row A , FMatrix1Row L )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a21 = data[ 7 ];
        float a22 = data[ 8 ];
        float a31 = data[ 14 ];
        float a32 = data[ 15 ];
        float a33 = data[ 16 ];
        float a41 = data[ 21 ];
        float a42 = data[ 22 ];
        float a43 = data[ 23 ];
        float a44 = data[ 24 ];
        float a51 = data[ 28 ];
        float a52 = data[ 29 ];
        float a53 = data[ 30 ];
        float a54 = data[ 31 ];
        float a55 = data[ 32 ];
        float a61 = data[ 35 ];
        float a62 = data[ 36 ];
        float a63 = data[ 37 ];
        float a64 = data[ 38 ];
        float a65 = data[ 39 ];
        float a66 = data[ 40 ];
        float a71 = data[ 42 ];
        float a72 = data[ 43 ];
        float a73 = data[ 44 ];
        float a74 = data[ 45 ];
        float a75 = data[ 46 ];
        float a76 = data[ 47 ];
        float a77 = data[ 48 ];

        L.data[0] = a11 = (float)Math.sqrt(a11);
        L.data[1] = 0;
        L.data[2] = 0;
        L.data[3] = 0;
        L.data[4] = 0;
        L.data[5] = 0;
        L.data[6] = 0;
        L.data[7] = a21 = (a21)/a11;
        L.data[8] = a22 = (float)Math.sqrt(a22-a21*a21);
        L.data[9] = 0;
        L.data[10] = 0;
        L.data[11] = 0;
        L.data[12] = 0;
        L.data[13] = 0;
        L.data[14] = a31 = (a31)/a11;
        L.data[15] = a32 = (a32-a31*a21)/a22;
        L.data[16] = a33 = (float)Math.sqrt(a33-a31*a31-a32*a32);
        L.data[17] = 0;
        L.data[18] = 0;
        L.data[19] = 0;
        L.data[20] = 0;
        L.data[21] = a41 = (a41)/a11;
        L.data[22] = a42 = (a42-a41*a21)/a22;
        L.data[23] = a43 = (a43-a41*a31-a42*a32)/a33;
        L.data[24] = a44 = (float)Math.sqrt(a44-a41*a41-a42*a42-a43*a43);
        L.data[25] = 0;
        L.data[26] = 0;
        L.data[27] = 0;
        L.data[28] = a51 = (a51)/a11;
        L.data[29] = a52 = (a52-a51*a21)/a22;
        L.data[30] = a53 = (a53-a51*a31-a52*a32)/a33;
        L.data[31] = a54 = (a54-a51*a41-a52*a42-a53*a43)/a44;
        L.data[32] = a55 = (float)Math.sqrt(a55-a51*a51-a52*a52-a53*a53-a54*a54);
        L.data[33] = 0;
        L.data[34] = 0;
        L.data[35] = a61 = (a61)/a11;
        L.data[36] = a62 = (a62-a61*a21)/a22;
        L.data[37] = a63 = (a63-a61*a31-a62*a32)/a33;
        L.data[38] = a64 = (a64-a61*a41-a62*a42-a63*a43)/a44;
        L.data[39] = a65 = (a65-a61*a51-a62*a52-a63*a53-a64*a54)/a55;
        L.data[40] = a66 = (float)Math.sqrt(a66-a61*a61-a62*a62-a63*a63-a64*a64-a65*a65);
        L.data[41] = 0;
        L.data[42] = a71 = (a71)/a11;
        L.data[43] = a72 = (a72-a71*a21)/a22;
        L.data[44] = a73 = (a73-a71*a31-a72*a32)/a33;
        L.data[45] = a74 = (a74-a71*a41-a72*a42-a73*a43)/a44;
        L.data[46] = a75 = (a75-a71*a51-a72*a52-a73*a53-a74*a54)/a55;
        L.data[47] = a76 = (a76-a71*a61-a72*a62-a73*a63-a74*a64-a75*a65)/a66;
        L.data[48]  = (float)Math.sqrt(a77-a71*a71-a72*a72-a73*a73-a74*a74-a75*a75-a76*a76);
        return !UtilEjml.isUncountable(L.data[48]);
    }

    public static boolean upper1( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];

        R.data[0]  = (float)Math.sqrt(a11);
        return !UtilEjml.isUncountable(R.data[0]);
    }

    public static boolean upper2( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a12 = data[ 1 ];
        float a22 = data[ 3 ];

        R.data[0] = a11 = (float)Math.sqrt(a11);
        R.data[2] = 0;
        R.data[1] = a12 = (a12)/a11;
        R.data[3]  = (float)Math.sqrt(a22-a12*a12);
        return !UtilEjml.isUncountable(R.data[3]);
    }

    public static boolean upper3( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a12 = data[ 1 ];
        float a22 = data[ 4 ];
        float a13 = data[ 2 ];
        float a23 = data[ 5 ];
        float a33 = data[ 8 ];

        R.data[0] = a11 = (float)Math.sqrt(a11);
        R.data[3] = 0;
        R.data[6] = 0;
        R.data[1] = a12 = (a12)/a11;
        R.data[4] = a22 = (float)Math.sqrt(a22-a12*a12);
        R.data[7] = 0;
        R.data[2] = a13 = (a13)/a11;
        R.data[5] = a23 = (a23-a12*a13)/a22;
        R.data[8]  = (float)Math.sqrt(a33-a13*a13-a23*a23);
        return !UtilEjml.isUncountable(R.data[8]);
    }

    public static boolean upper4( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a12 = data[ 1 ];
        float a22 = data[ 5 ];
        float a13 = data[ 2 ];
        float a23 = data[ 6 ];
        float a33 = data[ 10 ];
        float a14 = data[ 3 ];
        float a24 = data[ 7 ];
        float a34 = data[ 11 ];
        float a44 = data[ 15 ];

        R.data[0] = a11 = (float)Math.sqrt(a11);
        R.data[4] = 0;
        R.data[8] = 0;
        R.data[12] = 0;
        R.data[1] = a12 = (a12)/a11;
        R.data[5] = a22 = (float)Math.sqrt(a22-a12*a12);
        R.data[9] = 0;
        R.data[13] = 0;
        R.data[2] = a13 = (a13)/a11;
        R.data[6] = a23 = (a23-a12*a13)/a22;
        R.data[10] = a33 = (float)Math.sqrt(a33-a13*a13-a23*a23);
        R.data[14] = 0;
        R.data[3] = a14 = (a14)/a11;
        R.data[7] = a24 = (a24-a12*a14)/a22;
        R.data[11] = a34 = (a34-a13*a14-a23*a24)/a33;
        R.data[15]  = (float)Math.sqrt(a44-a14*a14-a24*a24-a34*a34);
        return !UtilEjml.isUncountable(R.data[15]);
    }

    public static boolean upper5( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a12 = data[ 1 ];
        float a22 = data[ 6 ];
        float a13 = data[ 2 ];
        float a23 = data[ 7 ];
        float a33 = data[ 12 ];
        float a14 = data[ 3 ];
        float a24 = data[ 8 ];
        float a34 = data[ 13 ];
        float a44 = data[ 18 ];
        float a15 = data[ 4 ];
        float a25 = data[ 9 ];
        float a35 = data[ 14 ];
        float a45 = data[ 19 ];
        float a55 = data[ 24 ];

        R.data[0] = a11 = (float)Math.sqrt(a11);
        R.data[5] = 0;
        R.data[10] = 0;
        R.data[15] = 0;
        R.data[20] = 0;
        R.data[1] = a12 = (a12)/a11;
        R.data[6] = a22 = (float)Math.sqrt(a22-a12*a12);
        R.data[11] = 0;
        R.data[16] = 0;
        R.data[21] = 0;
        R.data[2] = a13 = (a13)/a11;
        R.data[7] = a23 = (a23-a12*a13)/a22;
        R.data[12] = a33 = (float)Math.sqrt(a33-a13*a13-a23*a23);
        R.data[17] = 0;
        R.data[22] = 0;
        R.data[3] = a14 = (a14)/a11;
        R.data[8] = a24 = (a24-a12*a14)/a22;
        R.data[13] = a34 = (a34-a13*a14-a23*a24)/a33;
        R.data[18] = a44 = (float)Math.sqrt(a44-a14*a14-a24*a24-a34*a34);
        R.data[23] = 0;
        R.data[4] = a15 = (a15)/a11;
        R.data[9] = a25 = (a25-a12*a15)/a22;
        R.data[14] = a35 = (a35-a13*a15-a23*a25)/a33;
        R.data[19] = a45 = (a45-a14*a15-a24*a25-a34*a35)/a44;
        R.data[24]  = (float)Math.sqrt(a55-a15*a15-a25*a25-a35*a35-a45*a45);
        return !UtilEjml.isUncountable(R.data[24]);
    }

    public static boolean upper6( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a12 = data[ 1 ];
        float a22 = data[ 7 ];
        float a13 = data[ 2 ];
        float a23 = data[ 8 ];
        float a33 = data[ 14 ];
        float a14 = data[ 3 ];
        float a24 = data[ 9 ];
        float a34 = data[ 15 ];
        float a44 = data[ 21 ];
        float a15 = data[ 4 ];
        float a25 = data[ 10 ];
        float a35 = data[ 16 ];
        float a45 = data[ 22 ];
        float a55 = data[ 28 ];
        float a16 = data[ 5 ];
        float a26 = data[ 11 ];
        float a36 = data[ 17 ];
        float a46 = data[ 23 ];
        float a56 = data[ 29 ];
        float a66 = data[ 35 ];

        R.data[0] = a11 = (float)Math.sqrt(a11);
        R.data[6] = 0;
        R.data[12] = 0;
        R.data[18] = 0;
        R.data[24] = 0;
        R.data[30] = 0;
        R.data[1] = a12 = (a12)/a11;
        R.data[7] = a22 = (float)Math.sqrt(a22-a12*a12);
        R.data[13] = 0;
        R.data[19] = 0;
        R.data[25] = 0;
        R.data[31] = 0;
        R.data[2] = a13 = (a13)/a11;
        R.data[8] = a23 = (a23-a12*a13)/a22;
        R.data[14] = a33 = (float)Math.sqrt(a33-a13*a13-a23*a23);
        R.data[20] = 0;
        R.data[26] = 0;
        R.data[32] = 0;
        R.data[3] = a14 = (a14)/a11;
        R.data[9] = a24 = (a24-a12*a14)/a22;
        R.data[15] = a34 = (a34-a13*a14-a23*a24)/a33;
        R.data[21] = a44 = (float)Math.sqrt(a44-a14*a14-a24*a24-a34*a34);
        R.data[27] = 0;
        R.data[33] = 0;
        R.data[4] = a15 = (a15)/a11;
        R.data[10] = a25 = (a25-a12*a15)/a22;
        R.data[16] = a35 = (a35-a13*a15-a23*a25)/a33;
        R.data[22] = a45 = (a45-a14*a15-a24*a25-a34*a35)/a44;
        R.data[28] = a55 = (float)Math.sqrt(a55-a15*a15-a25*a25-a35*a35-a45*a45);
        R.data[34] = 0;
        R.data[5] = a16 = (a16)/a11;
        R.data[11] = a26 = (a26-a12*a16)/a22;
        R.data[17] = a36 = (a36-a13*a16-a23*a26)/a33;
        R.data[23] = a46 = (a46-a14*a16-a24*a26-a34*a36)/a44;
        R.data[29] = a56 = (a56-a15*a16-a25*a26-a35*a36-a45*a46)/a55;
        R.data[35]  = (float)Math.sqrt(a66-a16*a16-a26*a26-a36*a36-a46*a46-a56*a56);
        return !UtilEjml.isUncountable(R.data[35]);
    }

    public static boolean upper7( FMatrix1Row A , FMatrix1Row R )
    {
        float []data = A.data;

        float a11 = data[ 0 ];
        float a12 = data[ 1 ];
        float a22 = data[ 8 ];
        float a13 = data[ 2 ];
        float a23 = data[ 9 ];
        float a33 = data[ 16 ];
        float a14 = data[ 3 ];
        float a24 = data[ 10 ];
        float a34 = data[ 17 ];
        float a44 = data[ 24 ];
        float a15 = data[ 4 ];
        float a25 = data[ 11 ];
        float a35 = data[ 18 ];
        float a45 = data[ 25 ];
        float a55 = data[ 32 ];
        float a16 = data[ 5 ];
        float a26 = data[ 12 ];
        float a36 = data[ 19 ];
        float a46 = data[ 26 ];
        float a56 = data[ 33 ];
        float a66 = data[ 40 ];
        float a17 = data[ 6 ];
        float a27 = data[ 13 ];
        float a37 = data[ 20 ];
        float a47 = data[ 27 ];
        float a57 = data[ 34 ];
        float a67 = data[ 41 ];
        float a77 = data[ 48 ];

        R.data[0] = a11 = (float)Math.sqrt(a11);
        R.data[7] = 0;
        R.data[14] = 0;
        R.data[21] = 0;
        R.data[28] = 0;
        R.data[35] = 0;
        R.data[42] = 0;
        R.data[1] = a12 = (a12)/a11;
        R.data[8] = a22 = (float)Math.sqrt(a22-a12*a12);
        R.data[15] = 0;
        R.data[22] = 0;
        R.data[29] = 0;
        R.data[36] = 0;
        R.data[43] = 0;
        R.data[2] = a13 = (a13)/a11;
        R.data[9] = a23 = (a23-a12*a13)/a22;
        R.data[16] = a33 = (float)Math.sqrt(a33-a13*a13-a23*a23);
        R.data[23] = 0;
        R.data[30] = 0;
        R.data[37] = 0;
        R.data[44] = 0;
        R.data[3] = a14 = (a14)/a11;
        R.data[10] = a24 = (a24-a12*a14)/a22;
        R.data[17] = a34 = (a34-a13*a14-a23*a24)/a33;
        R.data[24] = a44 = (float)Math.sqrt(a44-a14*a14-a24*a24-a34*a34);
        R.data[31] = 0;
        R.data[38] = 0;
        R.data[45] = 0;
        R.data[4] = a15 = (a15)/a11;
        R.data[11] = a25 = (a25-a12*a15)/a22;
        R.data[18] = a35 = (a35-a13*a15-a23*a25)/a33;
        R.data[25] = a45 = (a45-a14*a15-a24*a25-a34*a35)/a44;
        R.data[32] = a55 = (float)Math.sqrt(a55-a15*a15-a25*a25-a35*a35-a45*a45);
        R.data[39] = 0;
        R.data[46] = 0;
        R.data[5] = a16 = (a16)/a11;
        R.data[12] = a26 = (a26-a12*a16)/a22;
        R.data[19] = a36 = (a36-a13*a16-a23*a26)/a33;
        R.data[26] = a46 = (a46-a14*a16-a24*a26-a34*a36)/a44;
        R.data[33] = a56 = (a56-a15*a16-a25*a26-a35*a36-a45*a46)/a55;
        R.data[40] = a66 = (float)Math.sqrt(a66-a16*a16-a26*a26-a36*a36-a46*a46-a56*a56);
        R.data[47] = 0;
        R.data[6] = a17 = (a17)/a11;
        R.data[13] = a27 = (a27-a12*a17)/a22;
        R.data[20] = a37 = (a37-a13*a17-a23*a27)/a33;
        R.data[27] = a47 = (a47-a14*a17-a24*a27-a34*a37)/a44;
        R.data[34] = a57 = (a57-a15*a17-a25*a27-a35*a37-a45*a47)/a55;
        R.data[41] = a67 = (a67-a16*a17-a26*a27-a36*a37-a46*a47-a56*a57)/a66;
        R.data[48]  = (float)Math.sqrt(a77-a17*a17-a27*a27-a37*a37-a47*a47-a57*a57-a67*a67);
        return !UtilEjml.isUncountable(R.data[48]);
    }

}
