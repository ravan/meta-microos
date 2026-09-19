SUMMARY = "The X Protocol"
DESCRIPTION = "Utility Macro Headers for X development"
LICENSE = "HPND"

PV = "1.20.2"

RPM_NAME = "util-macros-devel-1.20.2-1.7.aarch64.rpm"
RPM_HASH = "28ce4de2e05a4330020bc8b723cd1d9ac6374a765dd6eb1d3a658de744b1534080955cfe8cb125f0244a04eba38939d1f36fb1c235a4aabe8f24bc0d084cc506"

RPROVIDES:${PN} += "pkgconfig-xorg-macros \
util-macros-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/xorg-macros.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
