SUMMARY = "Documentation for texlive-fpl"
DESCRIPTION = "This package includes the documentation for texlive-fpl"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.003svn54512"

RPM_NAME = "texlive-fpl-doc-2026.226.1.003svn54512-60.2.noarch.rpm"
RPM_HASH = "2d498fb5f1d7782350ebb1f0ca6c2723485f6bb13f7d1954b59eb49e579db115e559733e6f8da7c1bce70b51fbed7cee0541eadd2e0b0111cd6b8f106e6042c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
