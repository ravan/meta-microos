SUMMARY = "Documentation for texlive-xstacks"
DESCRIPTION = "This package includes the documentation for texlive-xstacks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77979"

RPM_NAME = "texlive-xstacks-doc-2026.226.1.1svn77979-59.4.noarch.rpm"
RPM_HASH = "151c8d7eb1e1cf0a619dfe89e45bc26c34b2ca439e1ed0a8a532c4b6a4f85a7fa6e4a939062685bd5bbc301ad4f329d34aea41eb6ebc4e88a03e56c5df1f58dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xstacks-doc"

RDEPENDS:${PN} += ""

inherit rpm
