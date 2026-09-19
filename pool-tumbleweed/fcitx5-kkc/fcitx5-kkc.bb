SUMMARY = "Libkkc input method support for Fcitx5"
DESCRIPTION = "This package provides libkkc input method support for Fcitx5."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.9"

RPM_NAME = "fcitx5-kkc-5.1.9-1.6.aarch64.rpm"
RPM_HASH = "2def5bf38cb017bc548f067492999b1be1cd2581ddd4f50de2f8564227c985dc87450a44eb048d273f052814a94ab9a06a4bc095ca6d3cb1977a05d10456bc4e"

RPROVIDES:${PN} += "fcitx-kkc \
fcitx5-kkc \
libfcitx5-kkc-config.so"

RDEPENDS:${PN} += "fcitx5 \
kkc-data \
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
libkkc.so.2 \
libstdc++.so.6"

inherit rpm
