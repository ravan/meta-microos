SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.3"

RPM_NAME = "python314-annoy-1.17.3-2.7.aarch64.rpm"
RPM_HASH = "53d363a971b065bae97b7e1e947de56dd57be3b4708d24101a53eaeed8244547377457b347eeb88e188d0800c58ef340e5f2dc51a508495625ad01821416ceaf"

RPROVIDES:${PN} += "python3.14dist-annoy \
python314-annoy \
python3dist-annoy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
