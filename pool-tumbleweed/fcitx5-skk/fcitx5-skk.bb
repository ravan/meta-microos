SUMMARY = "Libskk input method engine for Fcitx5"
DESCRIPTION = "fcitx-skk is an input method engine for Fcitx, which uses libskk as its backend."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.9"

RPM_NAME = "fcitx5-skk-5.1.9-1.6.aarch64.rpm"
RPM_HASH = "8456dad5a10642dd0b9e1269f835d80a5fb0eb454feb2bc4fac3d749bfc0065734beca4f973dcd975ce8622e2ac10703c744511be401a6536dad44efb0b69a83"

RPROVIDES:${PN} += "fcitx-skk \
fcitx5-skk \
libfcitx5-skk-config.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Qt6WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libskk.so.0 \
libstdc++.so.6"

inherit rpm
