SUMMARY = "Documentation for texlive-srcredact"
DESCRIPTION = "This package includes the documentation for texlive-srcredact"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn38710"

RPM_NAME = "texlive-srcredact-doc-2026.226.1.0svn38710-64.2.noarch.rpm"
RPM_HASH = "9adeb7dd5b1f9d88ed068359d70e4eb3977050094ef19501c09cfa3fe1c65c095e329b2232e7706a7e5794e43d74a88e71c302c48d1cbd09cc02059e62b02493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-srcredact.1 \
texlive-srcredact-doc"

RDEPENDS:${PN} += ""

inherit rpm
