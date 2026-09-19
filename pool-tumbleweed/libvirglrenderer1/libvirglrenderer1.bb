SUMMARY = "Virgil3D renderer"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libvirglrenderer1-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "763eda4e308fae4350469332531fcc66ca8d64ecfd6997cfba861633fbd3a45e30a43608bdaf1d64284206b2802398a2d7b4bfdbd8bc9fc1da32db6593281324"

RPROVIDES:${PN} += "libvirglrenderer.so.1 \
libvirglrenderer1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6 \
libva-drm.so.2 \
libva.so.2"

inherit rpm
