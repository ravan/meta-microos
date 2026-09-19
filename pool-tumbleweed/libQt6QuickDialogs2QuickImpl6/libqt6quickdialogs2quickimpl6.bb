SUMMARY = "Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "The Qt 6 QuickDialogs2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickDialogs2QuickImpl6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f4fc41dee15d577cf42a7adbc5ad9bc0b23a910f061a74ff1d156e4494d175d2f7ba89a11497ad0612086e6bed8f86169e08267d311d7ad66dec4803e625cb11"

RPROVIDES:${PN} += "libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2QuickImpl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2Impl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
