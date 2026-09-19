SUMMARY = "Development files for netgen"
DESCRIPTION = "Development files for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "netgen-devel-6.2.2602-3.5.aarch64.rpm"
RPM_HASH = "97910040cfb202c88310ca7ba7540a81bbef9846eb9d9ff99fc544919eacc71495c985e51a79373e6f62f76a99f2bcbbc915d5f19107c380d35230549b1d6533"

RPROVIDES:${PN} += "cmake-Netgen \
netgen-devel"

RDEPENDS:${PN} += "libngcore-6-2-2602 \
libnggui-6-2-2602 \
libnglib-6-2-2602 \
netgen \
occt-devel"

inherit rpm
