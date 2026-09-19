SUMMARY = "Documentation for texlive-forest-ext"
DESCRIPTION = "This package includes the documentation for texlive-forest-ext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78039"

RPM_NAME = "texlive-forest-ext-doc-2026.226.0.0.3svn78039-60.2.noarch.rpm"
RPM_HASH = "8b50cd6cd72a953f03ebdacd7c0c3ae06118feb3c5062ebb44614dad4ac5ccd4f67161dbf9afb9135ffb13e508c748e41743f2f5b0a871358a4e3833a7eb11f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forest-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm
