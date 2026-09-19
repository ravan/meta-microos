SUMMARY = "Lua support for fcitx"
DESCRIPTION = "Lua support for fcitx"
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.15"

RPM_NAME = "fcitx5-lua-5.0.15-1.5.aarch64.rpm"
RPM_HASH = "e9a2efe8f1e1a5b0d89c63a88401daba8e1fb4ec91cae85132309a01977701b9200f24e7bb003559b0ca0563ee521d90a2be2942d043f76ce0cf8d556e5a3d7c"

RPROVIDES:${PN} += "fcitx5-lua \
libluaaddonloader.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
