SUMMARY = "Virgil3D renderer development files"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU. \
This package contains a server to test virgl rendering \
without GL."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "virglrenderer-test-server-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "4a4473cd85fb65c238a9766c9efd1ed5a3a46a70c3f8fd93189ce97135c1c220dbd2a7ab6ae9ee4c25e133a1e31a34a2e6bebd9be78438951bf47ae0a539c93f"

RPROVIDES:${PN} += "virglrenderer-test-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirglrenderer.so.1 \
libvirglrenderer1"

inherit rpm
