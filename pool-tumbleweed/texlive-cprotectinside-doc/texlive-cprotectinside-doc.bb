SUMMARY = "Documentation for texlive-cprotectinside"
DESCRIPTION = "This package includes the documentation for texlive-cprotectinside"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.0svn76924"

RPM_NAME = "texlive-cprotectinside-doc-2026.226.0.0.0.0svn76924-61.2.noarch.rpm"
RPM_HASH = "bde052334ac19279eea9ab833878182a7938d792b9ab2cc1b29ad33b69640aa9aece6a30e79278403e86ae0ebb50fce01bbfb91d0f5c69c2f1c60285ee1a1885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cprotectinside-doc"

RDEPENDS:${PN} += ""

inherit rpm
