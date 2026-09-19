SUMMARY = "Core library for fcitx5"
DESCRIPTION = "This package provides core libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.17"

RPM_NAME = "libFcitx5Core7-5.1.17-1.7.aarch64.rpm"
RPM_HASH = "a0723ed33899f6aea651d169ad81c89e50281b87a106b0538c569285fa30bf18963d61df365d9edd7cac77eed48a76238ed5230760e549f58feca65aa453924c"

RPROVIDES:${PN} += "libFcitx5Core.so.7 \
libFcitx5Core5 \
libFcitx5Core7 \
libfcitx-4-2-9 \
libfcitx-core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1 \
libxkbcommon.so.0"

inherit rpm
