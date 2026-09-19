SUMMARY = "FlightGear base scenery and data files"
DESCRIPTION = "This package contains the base scenery and aircraft for FlightGear. \
It must be installed together with the FlightGear flight simulator package."
LICENSE = "GPL-2.0-only"

PV = "2024.1.7"

RPM_NAME = "FlightGear-data-2024.1.7-1.1.noarch.rpm"
RPM_HASH = "d1386b0ba0fc176a00c60ad79ebed3b64c9007c99d37728d3bf49610234d62318e19f66caee3d654d6727799bf311e02d159b9dd739ea2bf8f846f318c09d579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "FlightGear-data"

RDEPENDS:${PN} += "liberation-fonts"

inherit rpm
