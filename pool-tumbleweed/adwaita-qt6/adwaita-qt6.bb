SUMMARY = "Adwaita Qt6 theme"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "adwaita-qt6-1.4.2-4.11.aarch64.rpm"
RPM_HASH = "9610663e4a62fae3ed986c721b6fe90a563ee4efbb1ffef250ad212f8fc57001fe7e071385577eea20a5def66234c73bc652811a16fe48bd0866c114c7ae8435"

RPROVIDES:${PN} += "adwaita-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libadwaitaqt6-1 \
libadwaitaqt6.so.1 \
libadwaitaqt6priv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
