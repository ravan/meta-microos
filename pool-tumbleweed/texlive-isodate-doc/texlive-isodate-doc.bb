SUMMARY = "Documentation for texlive-isodate"
DESCRIPTION = "This package includes the documentation for texlive-isodate"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.28svn78101"

RPM_NAME = "texlive-isodate-doc-2026.226.2.28svn78101-63.2.noarch.rpm"
RPM_HASH = "c97c481356b580c152da22dfa6721ba4aa3bff2344fcef916ebdf410798a49fd543568da64e6217b1ce9a6e6135c93cac5e1da3b098141118cc89eb1006f7b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isodate-doc"

RDEPENDS:${PN} += ""

inherit rpm
