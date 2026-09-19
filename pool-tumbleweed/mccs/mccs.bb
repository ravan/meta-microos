SUMMARY = "Multi Criteria CUDF Solver"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project. mccs take as input a \
CUDF problem and computes the best solution according to a set of criteria. \
It relies on a Integer Programming solver or a Pseudo Boolean solver to achieve \
its task. mccs can use a wide set of underlying solvers like Cplex, Gurobi, \
Lpsolver, Glpk, CbC, SCIP or WBO."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "mccs-1.1-2.19.aarch64.rpm"
RPM_HASH = "ae50a6b3e2f589d823f299b99b3117c0cb7f64a69d3580e1b049cae9c853747a0a2c7197b357cb8c32a9ce0af4c502aa1fb3a3bf066847ab898b6a1c24b6c06d"

RPROVIDES:${PN} += "mccs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblpsolve55.so.0 \
libstdc++.so.6"

inherit rpm
