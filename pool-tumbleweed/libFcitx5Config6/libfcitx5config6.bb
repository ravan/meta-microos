SUMMARY = "Configuration library for fcitx5"
DESCRIPTION = "This package provides configuration libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.17"

RPM_NAME = "libFcitx5Config6-5.1.17-1.7.aarch64.rpm"
RPM_HASH = "d9b1c707a1b3e87ff814470c423b1355ec1caf0d76fa6bab6ddd09b188ae45ed25da8db3ca92462dda309e81988762f4988d153e4ad40479a73a10563e200840"

RPROVIDES:${PN} += "libFcitx5Config.so.6 \
libFcitx5Config5 \
libFcitx5Config6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
