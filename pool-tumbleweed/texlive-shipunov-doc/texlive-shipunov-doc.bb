SUMMARY = "Documentation for texlive-shipunov"
DESCRIPTION = "This package includes the documentation for texlive-shipunov"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn52334"

RPM_NAME = "texlive-shipunov-doc-2026.226.1.2svn52334-60.2.noarch.rpm"
RPM_HASH = "5fce9a485d04184353ac123c4c7fa7659455b27c9eb68e78f12e7c866e614fc61ceecbb6ef4cb7090b94974ab9f2f8dcc08b223cc284766e11bf677826b4e79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shipunov-doc-en \
texlive-shipunov-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl"

inherit rpm
