SUMMARY = "Additional plasmoid widgets - development files"
DESCRIPTION = "This package contains development files to develop additional widgets for \
the Plasma desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "kdeplasma6-addons-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "5bb823ce4734c703df2e0e94bacc55d4082094f6bf7912e8f72bb5e0108cc541c889df52ad2c13ee2bcd7c61bd9fdd1c7c8dc7871ebb57ba0f3a2fa2cb557f23"

RPROVIDES:${PN} += "cmake-PlasmaPotdProvider \
cmake-PlasmaWeather \
kdeplasma6-addons-devel"

RDEPENDS:${PN} += "kdeplasma6-addons"

inherit rpm
