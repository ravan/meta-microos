SUMMARY = "Sinhala input method for Fcitx5"
DESCRIPTION = "Fcitx5-Sayura is a Sinhala input method for Fcitx5 input method framework ported from IBus-Sayura."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.5"

RPM_NAME = "fcitx5-sayura-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "7c1b98e48c134285acf524a323ceabfe67d3a0cc5657b1427632759d5e68c657ec7f6295682e08576699dcd3802faefa03bedaea7e6eb0bef538db4a3a295eb0"

RPROVIDES:${PN} += "fcitx-sayura \
fcitx5-sayura \
libsayura.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
