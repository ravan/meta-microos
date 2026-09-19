SUMMARY = "Virgil3D renderer development files"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU. \
This package contains the virgil3d renderer development \
files."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "virglrenderer-devel-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "f0125c9ffab33db2a4b1fbfd127a9d7beffd701d6634c7c2e7788ec71ef15c2215889c8fb30fdb2d88863cd52f1846f467939ee2a1748f875137e7f5b1cdad99"

RPROVIDES:${PN} += "pkgconfig-virglrenderer \
virglrenderer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirglrenderer1 \
pkgconfig-epoxy \
pkgconfig-gbm \
pkgconfig-libdrm \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-x11"

inherit rpm
