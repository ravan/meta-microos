SUMMARY = "Development files for hyprtoolkit"
DESCRIPTION = "Development files for hyprtoolkit."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "hyprtoolkit-devel-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "3fa8392edad39383f8441f9b24e24fbceb27ce4c0b6c274c489b8c42ab6b133f2507641aaafd1e00944323c2ad7853691c717b646318ed26f823d1458e7f6cdb"

RPROVIDES:${PN} += "hyprtoolkit-devel \
pkgconfig-hyprtoolkit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhyprtoolkit6 \
pkgconfig-absl-flat-hash-map \
pkgconfig-aquamarine \
pkgconfig-cairo \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-hyprgraphics \
pkgconfig-hyprlang \
pkgconfig-hyprutils \
pkgconfig-iniparser \
pkgconfig-libdrm \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pixman-1 \
pkgconfig-wayland-client \
pkgconfig-wayland-protocols \
pkgconfig-xkbcommon"

inherit rpm
