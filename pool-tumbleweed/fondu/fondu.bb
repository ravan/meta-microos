SUMMARY = "Converts between mac and unix fonts"
DESCRIPTION = "fondu allows you to convert a mac font into a unix one. ufond converts \
a unix font into a mac one. \
 \
Author: George Williams <gww at silcom.com>"
LICENSE = "BSD-3-Clause"

PV = "1.0.060102"

RPM_NAME = "fondu-1.0.060102-14.39.aarch64.rpm"
RPM_HASH = "29f799956e13b1c3b8047e4971b094fb596e5888dbf9617ba7a760063dcd642e8991220830bcc592623ebb8beb925ab00e8bd29dd05cc0c5fb7469a5cbf676a9"

RPROVIDES:${PN} += "fondu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
