SUMMARY = "Qt 6 LabsPlatform library"
DESCRIPTION = "The Qt 6 LabsPlatform library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsPlatform6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "579f106dd516d4890328e4fb6a1152d24148170b0d646190c070b984b287691c5c365a3e5dec80233c64c95f8e2394aee68beeff38bf5864d733d4076ab08d36"

RPROVIDES:${PN} += "libQt6LabsPlatform.so.6 \
libQt6LabsPlatform6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
