SUMMARY = "Development files for VOLK"
DESCRIPTION = "This package provides the the development files for VOLK."
LICENSE = "LGPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "volk-devel-3.3.0-1.5.aarch64.rpm"
RPM_HASH = "79bd5c6c0be4901243476400e9a5da7c9126e063e5eee2bcb81897c35615f2e026c69374975f92e9d66b698dcecc9d191171393bbf6649efcb130d72865d9384"

RPROVIDES:${PN} += "cmake-Volk \
gnuradio-devel-/usr/lib64/pkgconfig/volk.pc \
pkgconfig-volk \
volk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvolk.so.3.3 \
libvolk3-3"

inherit rpm
