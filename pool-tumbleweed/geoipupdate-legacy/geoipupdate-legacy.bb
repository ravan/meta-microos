SUMMARY = "GeoIP Lagacy Format Updater"
DESCRIPTION = "Script for updating data in GeoIP Legacy format."
LICENSE = "Apache-2.0 | MIT"

PV = "8.0.0"

RPM_NAME = "geoipupdate-legacy-8.0.0-1.2.aarch64.rpm"
RPM_HASH = "ec62ec9b002c9ace4c72961e6333b2b87780a9be2f271c5770b397b2db77c3bed3749d1d84d4d8049830bde4e420ad14c347a12c55dea5bfeb63285b318e265c"

RPROVIDES:${PN} += "geoipupdate-legacy"

RDEPENDS:${PN} += "/usr/bin/bash \
geoipupdate \
geolite2legacy"

inherit rpm
