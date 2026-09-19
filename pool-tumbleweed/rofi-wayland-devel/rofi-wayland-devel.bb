SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "1.7.9+wayland1+git.1757683229.9b0363ca"

RPM_NAME = "rofi-wayland-devel-1.7.9+wayland1+git.1757683229.9b0363ca-1.6.aarch64.rpm"
RPM_HASH = "86e2d938f5559eb87d0c752b025fa19656b9400812ee088efbbd73de956d978ac3735855ed246011be51abf61dc334e51d89a9a21445bb3eb5ca118c8f3d164b"

RPROVIDES:${PN} += "pkgconfig-rofi \
rofi-wayland-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0"

inherit rpm
