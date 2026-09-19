SUMMARY = "Documentation for texlive-fontawesome5"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome5"
LICENSE = "OFL-1.1"

PV = "2026.226.5.15.4svn77682"

RPM_NAME = "texlive-fontawesome5-doc-2026.226.5.15.4svn77682-60.2.noarch.rpm"
RPM_HASH = "c940e16a15b1e09d6e6357aaf23abac405b242dc478b1124656a540935cccc3a1dcea8ad366112fed2305f2334f1ac2af890ec9248ee2bd17d2750a82d8535d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome5-doc"

RDEPENDS:${PN} += ""

inherit rpm
