SUMMARY = "Documentation for texlive-advice"
DESCRIPTION = "This package includes the documentation for texlive-advice"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn70688"

RPM_NAME = "texlive-advice-doc-2026.226.1.1.1svn70688-61.2.noarch.rpm"
RPM_HASH = "f64cb21dd155475123352a39819bfdf16b3789ac864cfbc1bc3fd37e1af834b69b6c03cbc6a977c7497f40ff0adf066c91455557c5a9abeb6a482503890ba9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-advice-doc"

RDEPENDS:${PN} += ""

inherit rpm
