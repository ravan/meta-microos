SUMMARY = "Command line tools for openslide"
DESCRIPTION = "This package contains command line tools for working with virtual slides."
LICENSE = "LGPL-2.1-only"

PV = "4.0.1"

RPM_NAME = "openslide-tools-4.0.1-1.1.aarch64.rpm"
RPM_HASH = "1a115f0b1f128dfa3f257b8e6932b862a05c495589efe250a8e9dd91790ee0cfe3188311b8657a108ac94a5ce982cfb28b56cbb66977bc8a1c936d0e3004e5b8"

RPROVIDES:${PN} += "openslide-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libopenslide.so.1 \
libopenslide1 \
libpng16.so.16"

inherit rpm
