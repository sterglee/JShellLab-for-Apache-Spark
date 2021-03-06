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

package org.ejml.dense.row.linsol;

import javax.annotation.Generated;
import org.ejml.data.CMatrixRMaj;
import org.ejml.dense.row.CommonOps_CDRM;
import org.ejml.interfaces.linsol.LinearSolverDense;

/**
 * A matrix can be easily inverted by solving a system with an identify matrix.  The only
 * disadvantage of this approach is that additional computations are required compared to
 * a specialized solution.
 *
 * @author Peter Abeles
 */
@Generated("org.ejml.dense.row.linsol.InvertUsingSolve_ZDRM")
public class InvertUsingSolve_CDRM {

    public static void invert( LinearSolverDense<CMatrixRMaj> solver, CMatrixRMaj A, CMatrixRMaj A_inv, CMatrixRMaj storage ) {

        A_inv.reshape(A.numRows, A.numCols);

        CommonOps_CDRM.setIdentity(storage);

        solver.solve(storage, A_inv);
    }

    public static void invert( LinearSolverDense<CMatrixRMaj> solver, CMatrixRMaj A, CMatrixRMaj A_inv ) {

        A_inv.reshape(A.numRows, A.numCols);

        CommonOps_CDRM.setIdentity(A_inv);

        solver.solve(A_inv, A_inv);
    }
}
