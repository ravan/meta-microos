SUMMARY = "The GBM EGL external platform library"
DESCRIPTION = "The GBM EGL external platform library."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "libnvidia-egl-gbm1-1.1.3-2.1.aarch64.rpm"
RPM_HASH = "77b5d65848ff63705e8357b62c129a0751d0beacf8057627ebdf658b23fd43b15dd03505a77a1ebe8da821bcb3d187be9a87aa7b9aa2ee519a516d2b1b2109f1"

RPROVIDES:${PN} += "libnvidia-egl-gbm.so.1 \
libnvidia-egl-gbm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1"

inherit rpm
