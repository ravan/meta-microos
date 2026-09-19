SUMMARY = "Documentation for texlive-babel-finnish"
DESCRIPTION = "This package includes the documentation for texlive-babel-finnish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3ssvn77682"

RPM_NAME = "texlive-babel-finnish-doc-2026.226.1.3ssvn77682-60.2.noarch.rpm"
RPM_HASH = "9282c93318a50ade80876cb73b31a07d5aedef015f176c53cf9e3130a7a5b2081aac779bd7e5741cfa01324e75629de434168cac128bc2df30340e4280b5daca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
