SUMMARY = "Documentation for texlive-wordcloud"
DESCRIPTION = "This package includes the documentation for texlive-wordcloud"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-wordcloud-doc-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "a5aaa2d1fcb4cebe37f75230578835733a5b0f3f64dd1ae3549a96d8eb69e92c451ea90af8bb6f10c74899d63a38b602579b186e4a225932648049c61c1e867e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordcloud-doc"

RDEPENDS:${PN} += ""

inherit rpm
