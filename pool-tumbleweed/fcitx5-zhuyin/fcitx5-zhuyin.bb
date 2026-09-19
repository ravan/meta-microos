SUMMARY = "Libzhuyin Wrapper for Fcitx5"
DESCRIPTION = "Libzhuyin Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "fcitx5-zhuyin-5.1.6-1.6.aarch64.rpm"
RPM_HASH = "4b812178345feac59962e784fd3916509953f19ca13ee2f1b13c46653cc3436f91659ede91faf1e8618f9491c5657a9d73376f3e232c81506c3c376d50dcdaf3"

RPROVIDES:${PN} += "fcitx-zhuyin \
fcitx5-zhuyin"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libzhuyin.so.15"

inherit rpm
