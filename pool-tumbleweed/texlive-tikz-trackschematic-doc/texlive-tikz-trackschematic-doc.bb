SUMMARY = "Documentation for texlive-tikz-trackschematic"
DESCRIPTION = "This package includes the documentation for texlive-tikz-trackschematic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.1svn63480"

RPM_NAME = "texlive-tikz-trackschematic-doc-2026.226.0.0.7.1svn63480-59.2.noarch.rpm"
RPM_HASH = "703ff897927455d45202c6c730df151df83a41f1389beea280e6360fc6e76747c56ee2f50ddf253e2d1cc2a268a2f9f0493f02997880353a1c4677d338d66ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-trackschematic-doc"

RDEPENDS:${PN} += ""

inherit rpm
