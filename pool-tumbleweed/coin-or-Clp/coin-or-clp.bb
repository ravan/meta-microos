SUMMARY = "COIN-OR Linear Programming Solver"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.10"

RPM_NAME = "coin-or-Clp-1.17.10-1.7.aarch64.rpm"
RPM_HASH = "732b41b9c0ab0eaecd665f3cf458a2980072d9acab0a7c1316dcf2b232edddd947359f9cbd655994be0137ee4afd47c22c3aedad3515ea7e7645e1be65118d61"

RPROVIDES:${PN} += "coin-or-Clp"

RDEPENDS:${PN} += "libClp.so.1 \
libClpSolver.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
