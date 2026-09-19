SUMMARY = "Development files for libnova"
DESCRIPTION = "This package contains development files for libnova."
LICENSE = "LGPL-2.0+"

PV = "0.15.0"

RPM_NAME = "libnova-devel-0.15.0-11.9.aarch64.rpm"
RPM_HASH = "da6863fb05d84e32c0a6f4cc9c2a86fd2895517b52b2716d86a61782e50af942a9b4d92ba0e6aaad325ddd9407aac3c3b5eecd845c57843de5aff70c414c33ea"

RPROVIDES:${PN} += "libnova-devel"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libnova-0-15-0 \
libnova-0.15.so.0"

inherit rpm
