SUMMARY = "Shared libraries (common) for libextractor"
DESCRIPTION = "GNU Libextractor is a library for extracting meta data from various files types. \
 \
This package contains the shared libraries for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor_common1-1.14-1.2.aarch64.rpm"
RPM_HASH = "9bfa0ae9076775f6d10164f1c25edbf49bf2bb9067d2823e20dc10ce75c839a84a107bc2fee48cd6b9445c090eb84a81e975ad133d9e2378350796cc1c21276d"

RPROVIDES:${PN} += "libextractor-common.so.1 \
libextractor-common1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
