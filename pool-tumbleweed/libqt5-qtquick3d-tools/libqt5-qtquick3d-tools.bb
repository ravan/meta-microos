SUMMARY = "Qt Development Kit"
DESCRIPTION = "Tools for working with the Qt Quick 3D module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtquick3d-tools-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "3441548ae85f5a73686716c3fad6690beb5603cfe74567be80902d6d12d69a47309af610bf220695b7f1bdb40d561bd2d312efd63ff9c00a4070bf854cab1473"

RPROVIDES:${PN} += "libqt5-qtquick3d-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick3DAssetImport.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
