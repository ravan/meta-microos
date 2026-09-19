SUMMARY = "Documentation for texlive-volumes"
DESCRIPTION = "This package includes the documentation for texlive-volumes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-volumes-doc-2026.226.1.0svn75878-60.2.noarch.rpm"
RPM_HASH = "040e909a3b42e6ae389d0255c9d4905ca05b066f81f3e275f9419557a6dc9c42660e31eeb1750701810877bb9acce2e96b2f34a2d13079651d56a17f6a54ca38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-volumes-doc"

RDEPENDS:${PN} += ""

inherit rpm
