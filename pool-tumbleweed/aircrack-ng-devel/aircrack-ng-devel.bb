SUMMARY = "Development files for aircrack-ng"
DESCRIPTION = "Development files for aircrack-ng."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-devel-1.7-5.5.noarch.rpm"
RPM_HASH = "69cb7983e891b1bb0a6f0e3ff7bbe431750e97bdc3387e6829e1f1bb372d08b36ece1ad2d60ef69ceedcec55247d027aaf96c5d6e42d81ff294b05046aa22da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aircrack-ng-devel"

RDEPENDS:${PN} += "aircrack-ng"

inherit rpm
