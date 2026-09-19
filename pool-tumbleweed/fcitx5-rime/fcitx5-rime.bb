SUMMARY = "RIME support for Fcitx5"
DESCRIPTION = "This package provides RIME support for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-rime-5.1.12-1.4.aarch64.rpm"
RPM_HASH = "85473a598fa42eea7cf24da4cdff9acdf5577c336608133677d531a0083910fec0f88c003fa83732d8e664048cea6caa29ab7ac0467db2da5e81bec10357e199"

RPROVIDES:${PN} += "fcitx-rime \
fcitx5-rime \
librime.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
librime.so.1 \
libstdc++.so.6 \
rime"

inherit rpm
