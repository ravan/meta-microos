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

RPM_NAME = "python314-kiwisolver-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "9ae30af185fbee9d86890cb7358e8f8eec77c9e1e213e6baed3a9271dd8ed4b63335d5d0d482bfa37186bc290ac0ed7361ab3b943763634483c85815ea789624"

RPROVIDES:${PN} += "python3.14dist-kiwisolver \
python314-kiwisolver \
python3dist-kiwisolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
