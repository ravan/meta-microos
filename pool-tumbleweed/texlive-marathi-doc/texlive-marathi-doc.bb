SUMMARY = "Documentation for texlive-marathi"
DESCRIPTION = "This package includes the documentation for texlive-marathi"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.7svn61719"

RPM_NAME = "texlive-marathi-doc-2026.226.1.7svn61719-59.2.noarch.rpm"
RPM_HASH = "48a71b2b38dd14da879ddf3f2e9bb2e9d1b39308c077c0404d5a8f61892f55694926f44e93d1e562c884c7d744d709b596a07a36b1a191602e5f79d851515f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-marathi-doc-mr \
texlive-marathi-doc"

RDEPENDS:${PN} += ""

inherit rpm
