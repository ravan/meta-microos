SUMMARY = "Development files for the SpanDSP library"
DESCRIPTION = "This package contains files that are needed for developing or compiling \
software that uses the spandsp library."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+g57"

RPM_NAME = "spandsp-devel-3.0.0+g57-1.8.aarch64.rpm"
RPM_HASH = "3e17518f3f5fa39f6e07fe978fe5b779224a7763c7157bace22d10a4fee2bf2eda4b0dd21645f9d58ce9d271fff00317a8a1caec0639186e9216454b72a8fdad"

RPROVIDES:${PN} += "pkgconfig-spandsp \
spandsp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg-devel \
libspandsp3 \
libtiff-devel"

inherit rpm
