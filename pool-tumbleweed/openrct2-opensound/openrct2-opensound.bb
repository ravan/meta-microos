SUMMARY = "Open soundeffects for openRCT2"
DESCRIPTION = "Open source sound effects for OpenRCT2"
LICENSE = "CC-BY-SA-4.0"

PV = "1.0.6"

RPM_NAME = "openrct2-opensound-1.0.6-27.1.noarch.rpm"
RPM_HASH = "aee032928cf20ce3b9d3a9a85cfc8ae67258bdf2ef2a1ab5ae4fe7e95cccf028f47b219894ad6125eb00f47fb013a57ffed4cbb5e11ee4032eda4833c1f36f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openrct2-opensound"

RDEPENDS:${PN} += "openrct2"

inherit rpm
