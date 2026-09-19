SUMMARY = "Shared library for umockdev-preload"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the shared library for umockdev-preload."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19.7"

RPM_NAME = "libumockdev-preload0-0.19.7-1.4.aarch64.rpm"
RPM_HASH = "3c698540b2d317157047827ac5a936cae23c4df85e591a71d95e4a2a25dc9d9c93d9ff553db1783c0a6486de14da887f8e3cfd13b7919de6e5abcc2743b87190"

RPROVIDES:${PN} += "libumockdev-preload.so.0 \
libumockdev-preload0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
