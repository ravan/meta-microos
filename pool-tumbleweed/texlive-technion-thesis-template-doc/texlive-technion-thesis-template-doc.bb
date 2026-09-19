SUMMARY = "Documentation for texlive-technion-thesis-template"
DESCRIPTION = "This package includes the documentation for texlive-technion-thesis-template"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn49889"

RPM_NAME = "texlive-technion-thesis-template-doc-2026.227.1.0svn49889-62.2.noarch.rpm"
RPM_HASH = "6405e6b10302a1f29db84e0a53b220d389a4de6a1d31699183b84d90504e7e2bcf4be1f8aab346043095ba44d1157026f180ec5b7beecb7e0532f1ea9856b476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-technion-thesis-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
