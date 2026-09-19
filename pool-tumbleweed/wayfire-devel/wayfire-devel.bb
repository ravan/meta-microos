SUMMARY = "Devel files for wayfire"
DESCRIPTION = "Development files for wayfire."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wayfire-devel-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "dcc9241c54e7a1d911758225437d300345fb464d4c92dc47c41765374a7e8a516c522afe05f30f6f7ca56455106824f195fceb398f248ec1a19cc75488ce9425"

RPROVIDES:${PN} += "pkgconfig-wayfire \
pkgconfig-wf-utils \
wayfire-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwf-utils0 \
pkgconfig-cairo \
pkgconfig-glesv2 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pixman-1 \
pkgconfig-wayland-server \
pkgconfig-wf-config \
pkgconfig-wlroots-0.20 \
wayfire"

inherit rpm
