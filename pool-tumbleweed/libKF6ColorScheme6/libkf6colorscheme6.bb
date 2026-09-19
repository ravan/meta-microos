SUMMARY = "Classes to read and interact with KColorScheme"
DESCRIPTION = "Classes to read and interact with KColorScheme."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ColorScheme6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "798a0fe5c9e06f6b5f1db04a294a0c23629c6201f1010da97eaec8e393b5fef4695d01acb2245260e2a7a8ad91823f0b91e6b517de148ceaf85eca5339174bd0"

RPROVIDES:${PN} += "libKF6ColorScheme.so.6 \
libKF6ColorScheme6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcolorscheme \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
