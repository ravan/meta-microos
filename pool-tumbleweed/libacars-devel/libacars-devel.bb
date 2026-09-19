SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libacars-devel-1.3.1-1.27.aarch64.rpm"
RPM_HASH = "d4c7fc14b5bc3261dc9c7bd1be0f7abe98e642835c017f4826dbd53a809cb083b64f4c5c0690ba6a7e2769ad9feb618fdf5cde84c79c70e82ed485f2ddf9e4ab"

RPROVIDES:${PN} += "libacars-devel \
pkgconfig-libacars"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacars1"

inherit rpm
