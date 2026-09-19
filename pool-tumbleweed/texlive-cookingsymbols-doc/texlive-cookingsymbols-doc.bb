SUMMARY = "Documentation for texlive-cookingsymbols"
DESCRIPTION = "This package includes the documentation for texlive-cookingsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn74247"

RPM_NAME = "texlive-cookingsymbols-doc-2026.226.1.1svn74247-61.2.noarch.rpm"
RPM_HASH = "eacefc377e7c6f7e35262be98c9f0107d9a5137c836555cb38180fb75e8d0f88abccc63bb1b46351d2cbc530ddb7cf0e7bd5acc2603ba85dabbf2cb7431035ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cookingsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
