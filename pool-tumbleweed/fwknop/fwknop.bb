SUMMARY = "The fwknop Client"
DESCRIPTION = "fwknop stands for the 'FireWall KNock OPerator', and implements an authorization \
scheme called Single Packet Authorization (SPA)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.11"

RPM_NAME = "fwknop-2.6.11-1.10.aarch64.rpm"
RPM_HASH = "4a9c3d27cf7fb30cc07ac135680051ce5aff6439d2df76f28a38dd0bcbfa48c168f30b1c55aaa6a1465146e3002138d8f46051517d7fda721fa381de2d3f5eb9"

RPROVIDES:${PN} += "fwknop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfko.so.3"

inherit rpm
