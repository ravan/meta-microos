SUMMARY = "Automatic 3D tetrahedral mesh generator"
DESCRIPTION = "NETGEN is an automatic 3D tetrahedral mesh generator. It accepts \
input from constructive solid geometry (CSG) or boundary \
representation (BRep) from STL file format. The connection to a \
geometry kernel allows the handling of IGES and STEP files. NETGEN \
contains modules for mesh optimization and hierarchical mesh \
refinement."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "netgen-6.2.2602-3.5.aarch64.rpm"
RPM_HASH = "3bf81b47cdb93f4d2bf974f660275efd7efb431bbdf826faa77714d675b6240dfb2104baabd51f023dd1bb363d162bba1e69b88ab691069f17773fdfc192f7ac"

RPROVIDES:${PN} += "netgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libngcore.so.6.2.2602 \
libnggui.so.6.2.2602 \
libnglib.so.6.2.2602 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
