SUMMARY = "Documentation for texlive-lscapeenhanced"
DESCRIPTION = "This package includes the documentation for texlive-lscapeenhanced"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn70967"

RPM_NAME = "texlive-lscapeenhanced-doc-2026.226.1.0svn70967-61.2.noarch.rpm"
RPM_HASH = "13009254543d19c1eac43a05b8ec41febdd1fb0a6c77543359908e969b56d400f72a6c911da3a12edfb7a8f8cd194d00b714f4124bb777465670e964e900c827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lscapeenhanced-doc"

RDEPENDS:${PN} += ""

inherit rpm
