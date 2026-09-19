SUMMARY = "Generic library for reporting various problems"
DESCRIPTION = "Libraries providing API for reporting different problems in applications \
to different bug targets like Bugzilla, ftp, trac, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport_2-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "c7edc45129fb4c44842cccee2bbe0ebdb89ba45936689e1203833e33ee7ebe745853c4a62d31282db5a481f80ef6ceb8f2fd7e26548ed535940dd297042e3473"

RPROVIDES:${PN} += "libreport-2 \
libreport.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libaugeas.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsatyr.so.4 \
libsystemd.so.0"

inherit rpm
