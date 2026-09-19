SUMMARY = "A collection of utilities and examples to exercise VA-API"
DESCRIPTION = "libva-utils is a collection of utilities and examples to exercise \
VA-API in accordance with the libva project. \
A driver implementation is necessary to properly operate."
LICENSE = "EPL-1.0 & MIT"

PV = "2.24.0"

RPM_NAME = "libva-utils-2.24.0-1.1.aarch64.rpm"
RPM_HASH = "9b5c9fcb043ff00dc73032eb588021e324002b4a12f8ce197dbb708fba3383e50362be29fc501cf42623122e4176cb3d60796995236fed5364b9909c628b860d"

RPROVIDES:${PN} += "libva-utils \
vaapi-tools \
vaapi-wayland-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
