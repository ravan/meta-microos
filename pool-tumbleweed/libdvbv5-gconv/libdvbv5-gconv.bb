SUMMARY = "Gconv files with the charsets For Digital TV"
DESCRIPTION = "Some digital TV standards define their own charsets. Add library \
support for them: EN 300 468 and ARIB STD-B24"
LICENSE = "GPL-2.0-only"

PV = "1.32.0"

RPM_NAME = "libdvbv5-gconv-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "ca37d7e32e766274e5259635526d38b61458a76cba8b9fef51c53c4d8d79289f81c5682ccd37e53742eb8b877dfbd48b5b42093757fec337b79ecb2585325d9a"

RPROVIDES:${PN} += "libdvbv5-gconv"

RDEPENDS:${PN} += "/usr/sbin/iconvconfig \
ld-linux-aarch64.so.1 \
libJIS.so \
libJISX0213.so \
libc.so.6 \
libdvbv5-0"

inherit rpm
