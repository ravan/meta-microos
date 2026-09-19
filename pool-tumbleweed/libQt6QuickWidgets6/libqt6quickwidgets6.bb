SUMMARY = "Qt 6 QuickWidgets library"
DESCRIPTION = "The Qt 6 QuickWidgets library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickWidgets6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "df1980536ca7645ccea22d96be28ce2540ff02512951e56dbdf206978414234e609e163d8d8aa609124b8f0e9049eedde52531591410fa9f808173262d03fc05"

RPROVIDES:${PN} += "libQt6QuickWidgets.so.6 \
libQt6QuickWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
