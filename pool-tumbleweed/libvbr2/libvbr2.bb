SUMMARY = "Library for assisting in Vouch By Refence functions"
DESCRIPTION = "This package provides the shared library libvbr which \
assists in Vouch By Refence functions."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "libvbr2-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "1cf67c4802c579f54c40057e42d17399937bdf1561ad07bcbefdc4d0b459d3f86586cbd07ba10ec41f3c00fd5fea8fc8b67695fb94b20003ea93bc138bbe2250"

RPROVIDES:${PN} += "libvbr.so.2 \
libvbr2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
