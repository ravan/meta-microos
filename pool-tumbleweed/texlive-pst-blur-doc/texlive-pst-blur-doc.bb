SUMMARY = "Documentation for texlive-pst-blur"
DESCRIPTION = "This package includes the documentation for texlive-pst-blur"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-pst-blur-doc-2026.226.2.0svn15878-59.2.noarch.rpm"
RPM_HASH = "45e48d055c64cf90726fb75b64b3d64e10935a7cfcd52c64b3fb03f57057e5719c77b2af1617fdc19dbe07e787c8b489d4ed3362b568b896992b3d6193d67b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-blur-doc"

RDEPENDS:${PN} += ""

inherit rpm
