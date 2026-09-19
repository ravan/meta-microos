SUMMARY = "Documentation for texlive-hc"
DESCRIPTION = "This package includes the documentation for texlive-hc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-hc-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "d73f63ec75e79975554550f447b53db442e2492be24c3f0f9a656c08e40acbbd875c6d15ad5c702cb127e633c6a7aa4183816ac3f6bd82393ccad29febbf7d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hc-doc"

RDEPENDS:${PN} += ""

inherit rpm
