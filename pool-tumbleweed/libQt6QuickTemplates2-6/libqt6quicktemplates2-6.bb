SUMMARY = "Qt 6 QuickTemplates2 library"
DESCRIPTION = "The Qt 6 QuickTemplates2 library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickTemplates2-6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "3deb6f00d005d18f2d5ac26c1afdaeab7d4551e0ca0b72ef2860379a65da8bbd40be29b92cff400598a68d6341ed77e5522c747d8aad2f3aca7d2c7e3b16867b"

RPROVIDES:${PN} += "libQt6QuickTemplates2-6 \
libQt6QuickTemplates2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
