SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "casacore-openmpi5-3.8.0-1.5.aarch64.rpm"
RPM_HASH = "b3d61420f1beca4fb834ef3c12cef32f651e838eace3aab28445adb944387958e2f36ce1ad1e36a2780129e6e90fb2c3e166d62ed8e8af778e976d63b20cfed6"

RPROVIDES:${PN} += "casacore-openmpi5"

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
