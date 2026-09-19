SUMMARY = "A fast and easy-to-use status bar"
DESCRIPTION = "A fast and easy-to-use status bar for tilling WM"
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "polybar-3.7.2-3.9.aarch64.rpm"
RPM_HASH = "6fc0d4550a88448a62c704598a261ec90a3a48f0594ec99c2429788e40435690accbda399c55499411baeaf28e555e9b98c86ae6f8ef581ae8d13ca77c2669f7"

RPROVIDES:${PN} += "polybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libmpdclient.so.2 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpulse.so.0 \
libstdc++.so.6 \
libuv.so.1 \
libxcb-composite.so.0 \
libxcb-cursor.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb.so.1"

inherit rpm
