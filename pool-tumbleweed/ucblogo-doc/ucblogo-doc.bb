SUMMARY = "Documentation for ucblogo - a free logo interpreter"
DESCRIPTION = "This package provides additional documentation for ucblogo."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.5"

RPM_NAME = "ucblogo-doc-6.2.5-1.9.noarch.rpm"
RPM_HASH = "1f693169bf5b2af8ae980eb1ea9331eeaacfa865f43e715d52a5c01b22662037dd08bc2353f5bee27833e0414232d885949431d323c5a4022a3075b015fbd68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ucblogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
