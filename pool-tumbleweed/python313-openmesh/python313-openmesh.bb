SUMMARY = "A data structure for representing and manipulating polygon meshes"
DESCRIPTION = "A halfedge-based data structure for representing and manipulating polygon meshes."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python313-openmesh-1.2.1-3.7.aarch64.rpm"
RPM_HASH = "eb34fa50504cbec758966344c94f1b4db2245ee4be92e2772b453c72ebb87de1f8dad299cb3fc75d12638abc73b0720cc0ae38411a67250ea490fc53f29ad220"

RPROVIDES:${PN} += "python3-openmesh \
python3.13dist-openmesh \
python313-openmesh \
python3dist-openmesh"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
