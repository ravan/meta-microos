SUMMARY = "Documentation for texlive-tkz-tab"
DESCRIPTION = "This package includes the documentation for texlive-tkz-tab"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12csvn66115"

RPM_NAME = "texlive-tkz-tab-doc-2026.226.2.12csvn66115-59.2.noarch.rpm"
RPM_HASH = "354f01166babe12909f32a9d301883c70b6928e8e93c3048674b26165f9c9d6ad7091c877d74df646ea8949de86c1b9a2f2a4b2ba0aacfcc7d3cb84e0859b739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-tab-doc-fr \
texlive-tkz-tab-doc"

RDEPENDS:${PN} += ""

inherit rpm
