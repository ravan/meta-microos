SUMMARY = "Chewing Wrapper for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.10"

RPM_NAME = "fcitx5-chewing-5.1.10-1.4.aarch64.rpm"
RPM_HASH = "8ec1b8017048ba5c3970257e5a6af40a96e6802d931e6d8e33b3829e2a550d6d29b083406a71e76e23a7470f1917e5f1a1f7f9e01d4a56d282bc94a819da9404"

RPROVIDES:${PN} += "fcitx-chewing \
fcitx5-chewing \
libchewing.so"

RDEPENDS:${PN} += "chewing-data \
fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libchewing.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
