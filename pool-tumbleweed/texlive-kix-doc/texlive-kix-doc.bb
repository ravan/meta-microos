SUMMARY = "Documentation for texlive-kix"
DESCRIPTION = "This package includes the documentation for texlive-kix"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21606"

RPM_NAME = "texlive-kix-doc-2026.226.svn21606-63.2.noarch.rpm"
RPM_HASH = "a52e2673e9ea29acf1d3e381a8fed17b40ea94b8b7b311d39d30ecce3e6143ade16c5e726fef4cdd4f5f8dbc3aea8f45af0dfb2b0d054fc273f6cf751ef2d4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kix-doc"

RDEPENDS:${PN} += ""

inherit rpm
