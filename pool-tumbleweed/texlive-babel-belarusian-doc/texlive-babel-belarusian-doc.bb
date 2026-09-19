SUMMARY = "Documentation for texlive-babel-belarusian"
DESCRIPTION = "This package includes the documentation for texlive-babel-belarusian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn49022"

RPM_NAME = "texlive-babel-belarusian-doc-2026.226.1.5svn49022-60.2.noarch.rpm"
RPM_HASH = "2b43c309b8be000e9c6a3ba10511cfceb503a809744dda3896edb035402176fc014e3b6ff0bb5ba8d6ca81d22fd56ef14bf5c93118deab973a3e0c62ebddd580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-belarusian-doc"

RDEPENDS:${PN} += ""

inherit rpm
