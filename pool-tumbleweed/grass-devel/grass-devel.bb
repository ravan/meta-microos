SUMMARY = "Development files for GRASS GIS"
DESCRIPTION = "This package contains the development files for GRASS GIS"
LICENSE = "GPL-2.0-or-later"

PV = "8.5.0"

RPM_NAME = "grass-devel-8.5.0-1.1.aarch64.rpm"
RPM_HASH = "0015f61fdbbcf736a03ce04867a9f5a2705b8c17d049c4c30bd410866617d7abc69239ee75d9f906a002db6caa94853c99c1dd416067bcc1d08d4b872daaef87"

RPROVIDES:${PN} += "grass-devel"

RDEPENDS:${PN} += "grass"

inherit rpm
