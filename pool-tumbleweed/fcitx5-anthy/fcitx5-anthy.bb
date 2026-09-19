SUMMARY = "Anthy Wrapper for Fcitx5"
DESCRIPTION = "Anthy Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.9"

RPM_NAME = "fcitx5-anthy-5.1.9-1.4.aarch64.rpm"
RPM_HASH = "e0cce8d62ec44a9b1fd843a1fbb8d28178a39fe81dcc8e14b37b6c03d0f73f43539c2073c0601b2e3b249a824f03414b56555132b3b2a51262dea2d875796714"

RPROVIDES:${PN} += "fcitx-anthy \
fcitx5-anthy \
libanthy.so"

RDEPENDS:${PN} += "anthy \
fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libanthy.so.0 \
libanthydic.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
