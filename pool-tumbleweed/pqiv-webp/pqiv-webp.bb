SUMMARY = "Backend webp for pqiv"
DESCRIPTION = "Backend webp for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-webp-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "71832ecb8fac7052dce1c6cc8498650e04a7952ec074fb38f05392522a9dc98e1e0c4bf3051732553f8e8ebf5b8c5b3450d02d4f810b008ca253b89d62e2ed06"

RPROVIDES:${PN} += "pqiv-webp"

RDEPENDS:${PN} += "libcairo.so.2 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libwebp.so.7 \
pqiv"

inherit rpm
