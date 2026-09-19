SUMMARY = "Documentation for texlive-unicode-alphabets"
DESCRIPTION = "This package includes the documentation for texlive-unicode-alphabets"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66225"

RPM_NAME = "texlive-unicode-alphabets-doc-2026.226.svn66225-60.2.noarch.rpm"
RPM_HASH = "9379d9b90d56f5820531205dd899152274ce8feca5737e0039ab4eec48eb5fd66c6e83d83d26d072407e6089cf2b0f12f5acb19d07d7c0d66923fb9713c8e3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-alphabets-doc"

RDEPENDS:${PN} += ""

inherit rpm
