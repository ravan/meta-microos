SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python314-openmesh-1.2.1-3.7.aarch64.rpm"
RPM_HASH = "7304d86c81c9499fe46c5c42acb0b5b06bf63fa5ceadc78cd510dfa6912a736086edd893a73455c9105ea65c65f8037d2ec8995e93bdcb31c264e83062a207ac"

RPROVIDES:${PN} += "python3.14dist-openmesh \
python314-openmesh \
python3dist-openmesh"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
