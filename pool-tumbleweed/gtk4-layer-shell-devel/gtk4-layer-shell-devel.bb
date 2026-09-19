SUMMARY = "Development files for gtk4-layer-shell"
DESCRIPTION = "Development files and headers for gtk4-layer-shell."
LICENSE = "MIT"

PV = "1.3.0+git21.cbfdd73"

RPM_NAME = "gtk4-layer-shell-devel-1.3.0+git21.cbfdd73-1.1.aarch64.rpm"
RPM_HASH = "0d2313634dabb362a3e30b84b3a10f9c4f1911f45fe603a34170568f7da874629c0133fb780b75c96479ce619c2ea12c9a2cd93f6e7de4e00bf7aca387556237"

RPROVIDES:${PN} += "gtk4-layer-shell-devel \
liblayer-shell-preload.so \
pkgconfig-gtk4-layer-shell-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgtk4-layer-shell0 \
libwayland-client.so.0 \
pkgconfig-gtk4 \
pkgconfig-wayland-client"

inherit rpm
