SUMMARY = "M17n input method engine for Fcitx5"
DESCRIPTION = "M17n input method engine for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "fcitx5-m17n-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "ee0a541eba822bcc5dbc645e44fa9ab4e386715e2b035614ca893b1a1f6e5f4d642475ccd8a2bdc6a6343f795cba011814a372a502db1fe4cf105f2b9bfb08d8"

RPROVIDES:${PN} += "fcitx-m17n \
fcitx5-m17n \
libm17n.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm17n-core.so.0 \
libm17n.so.0 \
libstdc++.so.6 \
m17n-db"

inherit rpm
