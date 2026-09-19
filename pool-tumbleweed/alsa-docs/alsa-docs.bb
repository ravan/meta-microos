SUMMARY = "Additional Package Documentation for ALSA"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16.1"

RPM_NAME = "alsa-docs-1.2.16.1-2.1.noarch.rpm"
RPM_HASH = "7da58a6bbe10a63db2bf261fbac7680e5ea152bdb3b4bfb87d62dad54d8bfdcdf50fab76f5dade948002d5a75fe380378f231defb6e033a6cd5be21fb8ae5798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-docs"

RDEPENDS:${PN} += ""

inherit rpm
