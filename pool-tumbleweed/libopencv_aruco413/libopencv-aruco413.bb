SUMMARY = "Pattern grid detection libraries for OpenCV"
DESCRIPTION = "Pattern grid detectiion libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_aruco413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "fbb853546712303362c46b246f03fb749ca2be2fa416c80e53829ddf9e7db7aaef95dde772ea072d540508fd2054cd7f7edb3ad7c02918fe46814451fdd8c337"

RPROVIDES:${PN} += "libopencv-aruco.so.413 \
libopencv-aruco413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-objdetect.so.413 \
libstdc++.so.6"

inherit rpm
