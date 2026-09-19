SUMMARY = "Documentation for texlive-clock"
DESCRIPTION = "This package includes the documentation for texlive-clock"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-clock-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "096ce27d7646e63357fb7d8f02243cb2e2cafea3ffc4f1fa5fd0cbdf7eb361471ee08cb2b5158cc9492e04e1fe4e32fa8d18bd763507525b5f1f14e84b504797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clock-doc"

RDEPENDS:${PN} += ""

inherit rpm
