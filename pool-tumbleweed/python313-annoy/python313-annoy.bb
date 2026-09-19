SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.3"

RPM_NAME = "python313-annoy-1.17.3-2.7.aarch64.rpm"
RPM_HASH = "0e2aa5d50a90ca813259296906e1cfca9430e8ff836c1b25780628fa48a41ed41ddecf9509b55eab7b0e216a62f4011ce1f4bcf2391d54976ebc4cd8a41fae41"

RPROVIDES:${PN} += "python3-annoy \
python3.13dist-annoy \
python313-annoy \
python3dist-annoy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
