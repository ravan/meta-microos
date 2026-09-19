SUMMARY = "The Mozc backend for Fcitx 5"
DESCRIPTION = "The Mozc backend for Fcitx 5 provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain & Zlib"

PV = "3.33.6133.102"

RPM_NAME = "fcitx5-mozc-3.33.6133.102-2.2.aarch64.rpm"
RPM_HASH = "2a2d384c3d8b1bbe735f2193fc4fd28a76c4ba0e672bb17f67d4fa4bb0d937c20ffb6c0324c353f9cbdbddf7c5e366cd7e9d95e1542f34eafffb1f5009a76623"

RPROVIDES:${PN} += "fcitx-mozc \
fcitx5-mozc \
locale-fcitx5-ja"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
mozc \
mozc-gui-tools"

inherit rpm
