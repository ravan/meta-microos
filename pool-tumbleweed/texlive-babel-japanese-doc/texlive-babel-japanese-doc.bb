SUMMARY = "Documentation for texlive-babel-japanese"
DESCRIPTION = "This package includes the documentation for texlive-babel-japanese"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57733"

RPM_NAME = "texlive-babel-japanese-doc-2026.226.svn57733-60.2.noarch.rpm"
RPM_HASH = "28d052d5e1c917557562536d2103b0f5d96d5df9e02d0b0c7574942acd7dcb88115ca680b6a83c0a5087e2991f4bdb7552e38125def812fbb65aa920e55ea552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-babel-japanese-doc-ja;en \
texlive-babel-japanese-doc"

RDEPENDS:${PN} += ""

inherit rpm
