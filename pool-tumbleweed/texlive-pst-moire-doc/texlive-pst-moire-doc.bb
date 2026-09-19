SUMMARY = "Documentation for texlive-pst-moire"
DESCRIPTION = "This package includes the documentation for texlive-pst-moire"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn60411"

RPM_NAME = "texlive-pst-moire-doc-2026.226.2.2svn60411-59.2.noarch.rpm"
RPM_HASH = "894acdde998a8f7443caee89274a01c8895459fb2258594cf471876245da47d88bb5c2fc29a4ce860a6a4c7e67e0acf6afbb0aefa07ee62510e60af6c24c688b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-moire-doc"

RDEPENDS:${PN} += ""

inherit rpm
