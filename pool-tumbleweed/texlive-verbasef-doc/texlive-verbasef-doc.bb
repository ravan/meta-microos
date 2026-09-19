SUMMARY = "Documentation for texlive-verbasef"
DESCRIPTION = "This package includes the documentation for texlive-verbasef"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn21922"

RPM_NAME = "texlive-verbasef-doc-2026.226.1.1svn21922-60.2.noarch.rpm"
RPM_HASH = "02fab76e4c7601088d5a08849ba90cbf817ffe8e3ff105161ebb4f81caa3686c6c530a83bac377c2bfccef0f105717d3dd422bbf0f33f1fa2fd69009a60ed37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbasef-doc"

RDEPENDS:${PN} += ""

inherit rpm
