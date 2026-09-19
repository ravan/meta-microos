SUMMARY = "Backend wand for pqiv"
DESCRIPTION = "Backend wand for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-wand-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "d604a9faeb462ee55d187d7031606a6f7b88a9985e8d5ddbcf43000721733adef50fbab347013afed491df08eb77b0f99e70dd8a6e6e1d5d9dc25faf165e3bcb"

RPROVIDES:${PN} += "pqiv-wand"

RDEPENDS:${PN} += "libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
pqiv"

inherit rpm
