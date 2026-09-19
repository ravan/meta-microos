SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libopensm9-3.3.24-5.4.aarch64.rpm"
RPM_HASH = "a53dc4d7bef8991d8abce66561409d68a5b6ed30d9a9c88dc04e0bb977a54eeb1de2ea90d47d48b56ea7618cd4a3ba2ecf4eeeb88b9d60b2a6c786a266213ca2"

RPROVIDES:${PN} += "libopensm.so.9 \
libopensm9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmcomp.so.5"

inherit rpm
