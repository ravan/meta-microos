SUMMARY = "Development headers and libraries for libmysofa"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard. \
 \
This package contains the development libraries and headers for libmysofa."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libmysofa-devel-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "67774ce5374f9a8ab34148012af3519411e1f638019cc54a0466ae28a450e7529443cf1aba71674574a06d23df352a83a009ea2937873d52193020644c61e882"

RPROVIDES:${PN} += "cmake-mysofa \
libmysofa-devel \
pkgconfig-libmysofa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmysofa1"

inherit rpm
