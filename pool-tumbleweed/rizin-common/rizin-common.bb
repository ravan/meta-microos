SUMMARY = "Arch-independent SDB files for the rizin package"
DESCRIPTION = "Arch-independent SDB files used by rizin package. See rizin package for more \
information"
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "rizin-common-0.9.1-1.2.noarch.rpm"
RPM_HASH = "eb73f9b7f13c45b1920779933f0738d2c00df770ab3effedbf96ce6c174430f3fa6de0a542cc6d2d5af7538ccf6621588df502d6ad81430ac25062e72bc9c3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rizin-common"

RDEPENDS:${PN} += "rizin"

inherit rpm
