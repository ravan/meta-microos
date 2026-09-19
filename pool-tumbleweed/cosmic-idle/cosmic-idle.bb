SUMMARY = "Idle notify manager for COSMIC"
DESCRIPTION = "Idle notify manager for COSMIC."
LICENSE = "GPL-3.0-only"

PV = "1.0.8"

RPM_NAME = "cosmic-idle-1.0.8-1.5.aarch64.rpm"
RPM_HASH = "e09517099b130f97ca35fe8c64d15d81a6c20e5424c86f60674dfc515e0c7ade6e96610b53b102a59d22016d2e012f515cf6ba7b8c6f67c5290efa23a4759ba8"

RPROVIDES:${PN} += "cosmic-idle"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
