SUMMARY = "Development files for libfcrypto"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfcrypto."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfcrypto-devel-20260521-1.6.aarch64.rpm"
RPM_HASH = "9613e3c1e568df5f65cb431d788da0ba1c9b95f5669e0d044bb06d970e047e53b6d14945d66b6b2c329647e2c19bb8a73fade2aac6eca3ab9e7ad0df420662a8"

RPROVIDES:${PN} += "libfcrypto-devel \
pkgconfig-libfcrypto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcrypto1"

inherit rpm
