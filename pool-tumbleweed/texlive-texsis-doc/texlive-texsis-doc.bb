SUMMARY = "Documentation for texlive-texsis"
DESCRIPTION = "This package includes the documentation for texlive-texsis"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.18svn69742"

RPM_NAME = "texlive-texsis-doc-2026.227.2.18svn69742-62.2.noarch.rpm"
RPM_HASH = "faeaa23d4509326e2b2b016209fa3327c98b60a03f5e7ee980baf97a84e17e6f5a15f1cdee35046a7e5432860f565f1885c0aebb829deaf38c83a91b77d21365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texsis.1 \
texlive-texsis-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
