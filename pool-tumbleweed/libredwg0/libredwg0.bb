SUMMARY = "A library to handle DWG files"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD."
LICENSE = "GPL-3.0-or-later"

PV = "0.14.8413"

RPM_NAME = "libredwg0-0.14.8413-1.2.aarch64.rpm"
RPM_HASH = "f7f0d2be85308c14ff13b0a07c64d79f61c37cab4836375889a83b27824e3516ab3656fbf90d9dc6e755a8e84e7d4a80134cab39175d69dea1ab32a5241ef9e2"

RPROVIDES:${PN} += "libredwg.so.0 \
libredwg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
