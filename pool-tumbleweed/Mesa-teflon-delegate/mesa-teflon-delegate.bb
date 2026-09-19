SUMMARY = "TensorFlow Lite delegate for NPUs supported by Mesa"
DESCRIPTION = "Teflon is an external TensorFlow Lite delegate (libteflon.so) which offloads \
supported subgraphs to NPUs driven by Mesa Gallium drivers, currently \
rocket for Rockchip NPUs and etnaviv for VeriSilicon Vivante NPUs."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-teflon-delegate-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "06826fd6c20ad7660f10020443d9cbe71573cf0949a4784928e6ca7e8dbdb013eff41a230aad51de3d875a1c92b3e0bcb18962d5a2d8af2e95ad8832c7d23773"

RPROVIDES:${PN} += "Mesa-teflon-delegate \
libteflon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libexpat.so.1 \
libm.so.6 \
libz.so.1"

inherit rpm
