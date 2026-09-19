SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-cs-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "0b6b9ef3d61392b217e7d8e2c8d6e26300c87e747a774cc59bc89ca03fd625b7a803aee12f9bbdddb5015bb073cc587f9057742a03290e5af70dcdd666e8bf9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm
