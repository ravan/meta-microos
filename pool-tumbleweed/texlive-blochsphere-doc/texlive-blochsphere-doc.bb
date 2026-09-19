SUMMARY = "Documentation for texlive-blochsphere"
DESCRIPTION = "This package includes the documentation for texlive-blochsphere"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn38388"

RPM_NAME = "texlive-blochsphere-doc-2026.226.1.1svn38388-59.2.noarch.rpm"
RPM_HASH = "4e5c3224e0a9ec80c1a9b28cd44b28d3eeaa227196a247cbdaffa18951176fc8cb4d87658895a805834561c22e0357208fdab0bb61d7aa8291e756639f29aa0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blochsphere-doc"

RDEPENDS:${PN} += ""

inherit rpm
