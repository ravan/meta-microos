SUMMARY = "An implementation of the Cassowary constraint solver"
DESCRIPTION = "Kiwi is a C++ implementation of the Cassowary constraint solving \
algorithm. Kiwi is an implementation of the algorithm based on the \
seminal Cassowary paper, but it is not a refactoring of the original \
C++ solver. Kiwi ranges from 10x to 500x faster processing than the \
original Cassowary solver with the same input set, with typical use \
cases gaining a 40x improvement. Memory savings are consistently >5x. \
 \
In addition to the C++ solver, Kiwi ships with hand-rolled Python bindings."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-kiwisolver-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "e74aa43979f26b77f336c008be605cba00d9693ee2fa8b1e5877eb3889ef81074b311982a4a4b3fa6706679796caf86c486e22fd28893fd1b5b275dd1fc10fd9"

RPROVIDES:${PN} += "python3-kiwisolver \
python3.13dist-kiwisolver \
python313-kiwisolver \
python3dist-kiwisolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
