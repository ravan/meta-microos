SUMMARY = "Udev rules for Mirics MSi2500 based DVB dongles"
DESCRIPTION = "Udev rules for Mirics MSi2500 based DVB dongles."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "mirisdr-udev-2.0.0-1.1.noarch.rpm"
RPM_HASH = "b67278c55c16cf653c37d31313465f757c6ba517c7bd9b3c27754c74a464f2dbc6f1a6f3626bba1832da2d16fba378d59b71972695facde8a1c599b34be39e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mirisdr-udev"

RDEPENDS:${PN} += ""

inherit rpm
