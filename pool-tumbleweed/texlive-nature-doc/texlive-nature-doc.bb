SUMMARY = "Documentation for texlive-nature"
DESCRIPTION = "This package includes the documentation for texlive-nature"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21819"

RPM_NAME = "texlive-nature-doc-2026.226.1.0svn21819-61.2.noarch.rpm"
RPM_HASH = "8bcf474f2dda0cedac4cc8260b2f04405b1ea37935e9276708539587004ac2748cf1fc3f9e889325a1159af44a34d100c37ca1bac3f135c51ee25251cf874d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nature-doc"

RDEPENDS:${PN} += ""

inherit rpm
