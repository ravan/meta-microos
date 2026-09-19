SUMMARY = "COSMIC On-Screen Keyboard"
LICENSE = "GPL-3.0-only"

PV = "0.1.0+git20260122.eee4d04"

RPM_NAME = "cosmic-osk-0.1.0+git20260122.eee4d04-1.2.aarch64.rpm"
RPM_HASH = "15b5cbdeb809a5ebdfcd6e80d76c0a573f7ec5421c1c125c27efa2c11c7044059c4ece426be224f69874783f98b1b2487689dc2b9eb00d7b5aed8a285d92314c"

RPROVIDES:${PN} += "cosmic-osk"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
