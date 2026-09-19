SUMMARY = "Jigdo Template Export Library"
DESCRIPTION = "libjte is a library providing support for creating jigdo files, to be used by \
ISO image creation tools."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22"

RPM_NAME = "libjte2-1.22-1.21.aarch64.rpm"
RPM_HASH = "648442435796c32a365a710ef055b8b08805916052d215ba5cac140fbc695d37dee80c7797bda7b227eb6f93bd61304bb8634459cc09b6811173fade7409675c"

RPROVIDES:${PN} += "libjte.so.2 \
libjte2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
