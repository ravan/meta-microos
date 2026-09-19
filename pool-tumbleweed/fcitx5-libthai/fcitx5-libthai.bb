SUMMARY = "Libthai input method engine for Fcitx5"
DESCRIPTION = "fcitx-libthai is an input method engine for Fcitx, which uses libthai as its backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.8"

RPM_NAME = "fcitx5-libthai-5.1.8-2.3.aarch64.rpm"
RPM_HASH = "08537afb958df422d1f3989ce9245dbd2163b6545e1b647640a93925775d0b8158f764a2bc77e2728d059f3661ccb8906936f805e007e5b37e9b1d6dc3c4d0f7"

RPROVIDES:${PN} += "fcitx5-libthai \
libthai.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libthai-data \
libthai.so.0"

inherit rpm
