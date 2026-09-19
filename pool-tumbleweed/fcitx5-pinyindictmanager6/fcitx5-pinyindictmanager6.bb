SUMMARY = "Fcitx5 Pinyin dictionary manager library"
DESCRIPTION = "Fcitx5 Pinyin dictionary manager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.11"

RPM_NAME = "fcitx5-pinyindictmanager6-5.1.11-1.4.aarch64.rpm"
RPM_HASH = "e9f30395efddf691fea0b0e91540bc81eada7be2954c29d596d470c65dc75b1a927efc62bf207a1dcb075f2cbe0f1c3039c7d5af1ce6e363d745a7c3cac7c5ca"

RPROVIDES:${PN} += "fcitx5-pinyindictmanager6 \
libpinyindictmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Qt6WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
