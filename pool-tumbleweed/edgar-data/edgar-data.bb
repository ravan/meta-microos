SUMMARY = "Architecture independent data for edgar"
DESCRIPTION = "This package contains the game data for edgar. \
It is required to play the game."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "edgar-data-1.38-1.5.noarch.rpm"
RPM_HASH = "4e485edf6c17e8aa814e76746455651028a78e425783161e15f4ddd1a5ca15c1cd00f95d15d58c5cbf6f705964d83e8325c582da5d3bb652f4592887a8289193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edgar-data"

RDEPENDS:${PN} += "edgar"

inherit rpm
