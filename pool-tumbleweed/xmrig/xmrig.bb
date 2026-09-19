SUMMARY = "XMR mining application"
DESCRIPTION = "Open source CPU/GPU XMR cryptocurrency miner."
LICENSE = "GPL-3.0-only"

PV = "6.26.0"

RPM_NAME = "xmrig-6.26.0-1.2.aarch64.rpm"
RPM_HASH = "416ae519ffa69b4150261f9575c043660969eaa29546439f898ff568496c1e8a228b7df06f0c59ae512cb49a11114ef873a00850dab31ad625c9172349d073cd"

RPROVIDES:${PN} += "config-xmrig \
xmrig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libhwloc.so.15 \
libm.so.6 \
libssl.so.3 \
libuv.so.1"

inherit rpm
