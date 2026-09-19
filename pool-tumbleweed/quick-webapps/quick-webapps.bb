SUMMARY = "Web App Manager written with love and libcosmic"
DESCRIPTION = "Web App Manager for the COSMIC DE written with love and libcosmic. \
Allows you to simply create web applications from given url working \
inside separate window of your browser of choice."
LICENSE = "GPL-3.0-only"

PV = "1.0.2+6"

RPM_NAME = "quick-webapps-1.0.2+6-1.11.aarch64.rpm"
RPM_HASH = "800db0405db56eb7f4648e07f06733f672233c912806043a435e755514bdf25e5dd82436b2d188139b90b1ebb896e58e835a91959b36df2f5112f16794519e12"

RPROVIDES:${PN} += "quick-webapps"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libxkbcommon.so.0 \
papirus-icon-theme"

inherit rpm
