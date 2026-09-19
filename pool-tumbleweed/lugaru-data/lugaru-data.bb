SUMMARY = "Arch-independent data files for the Lugaru game"
DESCRIPTION = "This package contains arch-independent data files for the game Lugaru."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "1.2"

RPM_NAME = "lugaru-data-1.2-3.6.noarch.rpm"
RPM_HASH = "310a613a9c1e1004435a4877212d040ae6c58eb913e5ae6fc947ee929a9b5c64259eddc12f29265753c2906d3fbfd849aae453d8cf19de0bb12c68cd0fe3d056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lugaru-data"

RDEPENDS:${PN} += "lugaru"

inherit rpm
