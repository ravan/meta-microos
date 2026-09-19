SUMMARY = "Documentation for texlive-ulqda"
DESCRIPTION = "This package includes the documentation for texlive-ulqda"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn26313"

RPM_NAME = "texlive-ulqda-doc-2026.226.1.1svn26313-60.2.noarch.rpm"
RPM_HASH = "15b2a867dabb2f1b3ee2cc8998df5d9194cf78aa12dfb829a6633a95e67c00ff2b28117e4fcbbb9359faa64b4936b773ad64ac2820f363cb85e2d4f9af5b3710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ulqda-doc"

RDEPENDS:${PN} += ""

inherit rpm
