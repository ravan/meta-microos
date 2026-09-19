SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "casacore-3.8.0-1.6.aarch64.rpm"
RPM_HASH = "b3fedfbaecee2616d421e07406b93d2ab2913a4a6b146b6fd482c0b127855e3f6d6959567a0f37b8b423ecddc80150ea52e449f7b53e7aad1cea6b3d7f95cad4"

RPROVIDES:${PN} += "casacore"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcasa-casa.so.9 \
libcasa-coordinates.so.9 \
libcasa-fits.so.9 \
libcasa-images.so.9 \
libcasa-lattices.so.9 \
libcasa-measures.so.9 \
libcasa-ms.so.9 \
libcasa-msfits.so.9 \
libcasa-scimath.so.9 \
libcasa-tables.so.9 \
libgcc-s.so.1 \
libgomp.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
