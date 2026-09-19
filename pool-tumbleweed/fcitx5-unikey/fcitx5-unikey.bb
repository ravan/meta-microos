SUMMARY = "Unikey engine support for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.1.9"

RPM_NAME = "fcitx5-unikey-5.1.9-1.5.aarch64.rpm"
RPM_HASH = "20eea7a8ec7cd6849bf53c00e3759bbae5931590a959d818f76e3228751d4719f375d347c3da2c9e7995ee42b594ec3135bf68effcf70ba878ceb3cb0b653689"

RPROVIDES:${PN} += "fcitx-unikey \
fcitx5-unikey \
libfcitx5-unikey-keymap-editor.so \
libfcitx5-unikey-macro-editor.so \
libunikey.so"

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
libstdc++.so.6"

inherit rpm
