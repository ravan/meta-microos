SUMMARY = "Documentation for texlive-basicarith"
DESCRIPTION = "This package includes the documentation for texlive-basicarith"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn35460"

RPM_NAME = "texlive-basicarith-doc-2026.226.1.1svn35460-60.2.noarch.rpm"
RPM_HASH = "ee77813b71d0b4e2ae59dc03003e00abc7cb6461b1db7cd7a01e5a63747f713d058125b517e75544fd446d52bba988879468cd0d284dca4b837b0e54554c524a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-basicarith-doc"

RDEPENDS:${PN} += ""

inherit rpm
