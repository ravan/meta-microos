SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Service6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f15d640f158e40641438f485dff8cd5890d7c6e323d7fe0977f6d72daa87df9b580afdab4cae85ecb4c3901f1f65d35dc5a629c3e9835ea9e0ecc28d60614ab7"

RPROVIDES:${PN} += "libKF6Service.so.6 \
libKF6Service6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kservice \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
