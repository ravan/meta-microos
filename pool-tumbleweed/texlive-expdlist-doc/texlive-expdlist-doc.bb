SUMMARY = "Documentation for texlive-expdlist"
DESCRIPTION = "This package includes the documentation for texlive-expdlist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn76924"

RPM_NAME = "texlive-expdlist-doc-2026.226.2.4svn76924-59.2.noarch.rpm"
RPM_HASH = "bee481b9cb27e5a00ae1f2ce0891be7fdfa4c7fb5df068eef03be80aa9df60273da165495343a6425bb8ef57302cd13940bba1b211f5f97d26b9afda56bef562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-expdlist-doc-de;en \
texlive-expdlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
