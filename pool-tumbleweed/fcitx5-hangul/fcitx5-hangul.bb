SUMMARY = "Hangul Wrapper for Fcitx5"
DESCRIPTION = "Hangul Wrapper for Fcitx5."
LICENSE = "LGPL-2.1-only"

PV = "5.1.8"

RPM_NAME = "fcitx5-hangul-5.1.8-1.4.aarch64.rpm"
RPM_HASH = "6ffee85e352d5e3ec6e0411a9348b8b52a89eff2a12f18012e73353a12964f3afa2c2a72521db4f0a3fc58512c9dbbd668cdcbd294dae5fb0d7e16f589cfc464"

RPROVIDES:${PN} += "fcitx-hangul \
fcitx5-hangul \
libhangul.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libhangul.so.1 \
libstdc++.so.6"

inherit rpm
