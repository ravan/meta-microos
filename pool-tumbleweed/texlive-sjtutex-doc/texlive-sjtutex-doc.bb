SUMMARY = "Documentation for texlive-sjtutex"
DESCRIPTION = "This package includes the documentation for texlive-sjtutex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.1svn78164"

RPM_NAME = "texlive-sjtutex-doc-2026.226.2.3.1svn78164-64.2.noarch.rpm"
RPM_HASH = "22ab353990fd652254edaa6bb227819a7bf625a8dc228850c79dba0a98a9227dbfc39f8e3334ba382216648c0a9cd39fbfc6a8759c99bea0d0dded84e2b66c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sjtutex-doc-zh \
texlive-sjtutex-doc"

RDEPENDS:${PN} += ""

inherit rpm
