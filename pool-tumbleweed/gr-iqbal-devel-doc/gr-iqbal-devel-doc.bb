SUMMARY = "Documentation for gr-iqbal"
DESCRIPTION = "Documentation for gr-iqbal module for GNU Radio."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20250425"

RPM_NAME = "gr-iqbal-devel-doc-0.39.0git20250425-1.5.noarch.rpm"
RPM_HASH = "19bd83e7657c3bad18c495cebf4b29a9e282c51d5430fb67ff21d6a5e2610fa3e87ef087cea83ffc6ca913395f1d9cd80c947f00820677bad7fe1ff8a622a744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
