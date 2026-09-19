SUMMARY = "QGIS sample data"
DESCRIPTION = "QGIS sample data with raster, vector, gps files and a GRASS location from the Alaska area."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "qgis-sample-data-4.2.1-1.2.noarch.rpm"
RPM_HASH = "54b585bb3ff44dbfda08690143aeb741509c54bf5bfdb9400f3e9cf61fb86f81a98517be9e1d5241e339aee1301af6e6820a209a65c920d75812eb68885a4159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
