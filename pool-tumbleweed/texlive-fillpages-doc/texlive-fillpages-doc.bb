SUMMARY = "Documentation for texlive-fillpages"
DESCRIPTION = "This package includes the documentation for texlive-fillpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn73550"

RPM_NAME = "texlive-fillpages-doc-2026.226.1.1.0svn73550-59.2.noarch.rpm"
RPM_HASH = "ce9cfb7e8966f0855faa6f3fa0e6804ef4e88af4e1c2c1cd1afc39282616566f2858e43213b42b9b43b43e23ca7b6ca9ce641e2a12fc7b658b50996ee76805af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fillpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
