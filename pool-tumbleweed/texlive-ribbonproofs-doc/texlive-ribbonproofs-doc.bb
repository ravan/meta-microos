SUMMARY = "Documentation for texlive-ribbonproofs"
DESCRIPTION = "This package includes the documentation for texlive-ribbonproofs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-doc-2026.226.1.0svn31137-60.4.noarch.rpm"
RPM_HASH = "c368522ebfc8ce657653c79175b280763ee66b2a332438d10a95cad812fccc89c9baa8f978eba7ee6265b68671bff4fd1bb793bd4e9597066748499ab9413139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ribbonproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
