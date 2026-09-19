SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "rofi-devel-2.0.0-1.7.aarch64.rpm"
RPM_HASH = "4de096b134fa569f15b46032d3873e776fcb716a7e6de5f25d0408773d2c36df48275a7d2ea0cb1520a0e697cfff5efb9b7e4f9a4ba2e9047695160ccd426729"

RPROVIDES:${PN} += "pkgconfig-rofi \
rofi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0"

inherit rpm
