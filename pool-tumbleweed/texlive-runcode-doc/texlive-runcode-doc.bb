SUMMARY = "Documentation for texlive-runcode"
DESCRIPTION = "This package includes the documentation for texlive-runcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn73500"

RPM_NAME = "texlive-runcode-doc-2026.226.2.4svn73500-60.2.noarch.rpm"
RPM_HASH = "4165f754638c46bd92ed6e772ee7cbb5dff95ea1176b9677fa59bc56c75ffe4d9e7233b0ee2183d9af4dfd9c3cd9d78f0daadec6fb9949f3b67d379678e162bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-runcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
