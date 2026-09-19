SUMMARY = "Library for C date and time functions"
DESCRIPTION = "Library for C date and time functions. \
 \
libcdatetime is a low level member of the libyal library family."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcdatetime1-20260703-1.2.aarch64.rpm"
RPM_HASH = "14a1245510093815a61df55a1ae8eece674f405eeeaf3cf6163176b7a9a2d17d44e0c7b42247444007b2f7f84c67f28c73962acc70c06580a077c7e1585e4870"

RPROVIDES:${PN} += "libcdatetime.so.1 \
libcdatetime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
