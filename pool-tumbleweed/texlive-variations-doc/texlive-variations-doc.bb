SUMMARY = "Documentation for texlive-variations"
DESCRIPTION = "This package includes the documentation for texlive-variations"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-variations-doc-2026.226.0.0.3svn15878-60.2.noarch.rpm"
RPM_HASH = "7e923218a8a99023f5afa5b48a079af1b2ec79b30325d55d8df9eb2088e8e9c9a123bacd4906dd4d170158df6d04a666d7b63fa7beb80eca9995fd2d85f140f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-variations-doc-fr;en \
texlive-variations-doc"

RDEPENDS:${PN} += ""

inherit rpm
