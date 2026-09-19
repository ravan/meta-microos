SUMMARY = "libreport's newt interface"
DESCRIPTION = "This package contains a simple newt application for reporting \
bugs"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-newt-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "c005b510b4c5903d56acaa8093195399755cd9d7f788f3a89bf7f9e072882344e79fa7de8c3536345cecaa43041252a39e490179b075afb795fcb3cf2b8c9478"

RPROVIDES:${PN} += "libreport-newt \
report-newt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnewt.so.0.52 \
libreport-2 \
libreport.so.2"

inherit rpm
