SUMMARY = "Documentation for texlive-apa"
DESCRIPTION = "This package includes the documentation for texlive-apa"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.4svn54080"

RPM_NAME = "texlive-apa-doc-2026.226.1.3.4svn54080-61.2.noarch.rpm"
RPM_HASH = "94b9a1ea569d1d22cbade6b0bfe8b689ca660d442c3145790bbc3d03109fde969c7ed9cd3f94a59783d64015f8d9a84cce864be568c1aeb9b3433f10a7b16306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa-doc"

RDEPENDS:${PN} += ""

inherit rpm
