SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "casacore-openmpi4-3.8.0-1.6.aarch64.rpm"
RPM_HASH = "3fb89998b7be5aaecbb69c2e181d80f5a25aae16c27c33db9b152a37dadb0e8bd57bc6b7ef4da7e1faa26d7dd438a5e23914551e097e1c66df669e2d8cb08990"

RPROVIDES:${PN} += "casacore-openmpi4"

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
libmpi.so.40 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
