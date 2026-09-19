SUMMARY = "Common package for soelim alternatives"
DESCRIPTION = "Interpret .so requests in manpages. Common package for soelim alternatives."
LICENSE = "GPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "soelim-common-1.23.0-6.4.noarch.rpm"
RPM_HASH = "c0bb363f37f93808ebd8609c6a98c1592ed83cf73bda62a3cce5c4a2406c639e3d242efbc8f7d2a64b12f1f19c58bd12ebcd77f3e2392ac4f71b324cc29444a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "soelim-common"

RDEPENDS:${PN} += "alts \
soelim"

inherit rpm
