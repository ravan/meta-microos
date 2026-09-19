SUMMARY = "Python bindings for the OpenShot library"
DESCRIPTION = "This package provides the Python bindings for the OpenShot library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python3-openshot-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "9411ecb9b700236222cc521879b98dc81f510d7252d045b464be18f053b253857625d9a1d33e90d369bcdffacab93dfb415752c46e1b57ad67c63b5a0b2c6a59"

RPROVIDES:${PN} += "python3-openshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libopencv-core.so.413 \
libopencv-flann.so.413 \
libopencv-imgproc.so.413 \
libopenshot-audio.so.10 \
libopenshot.so.31 \
libpython3.13.so.1.0 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
