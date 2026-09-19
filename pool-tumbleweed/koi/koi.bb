SUMMARY = "Theme scheduling for the KDE Plasma Desktop"
DESCRIPTION = "Koi is a program designed to provide the KDE Plasma Desktop functionality \
to automatically switch between light and dark themes. Koi is under active \
development, and while it is stable enough to use daily, expect bugs. Koi is \
designed to be used with Plasma, and while some features may function under \
different desktop environments, they are unlikely to work and untested."
LICENSE = "LGPL-3.0-only"

PV = "0.6"

RPM_NAME = "koi-0.6-1.5.aarch64.rpm"
RPM_HASH = "0b5680233a1a955adffee15f32553b4a4291a63ae4c27dc3a1dbc1020c8a3da0cd740eda27afb3985cf4140421e247967a32b82c34dfd8cbdce5ff8cfb8564a1"

RPROVIDES:${PN} += "koi"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplasma6-components \
libplasma6-desktoptheme \
libstdc++.so.6 \
plasma6-desktop \
plasma6-workspace"

inherit rpm
