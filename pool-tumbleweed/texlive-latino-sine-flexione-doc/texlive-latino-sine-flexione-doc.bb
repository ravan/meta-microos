SUMMARY = "Documentation for texlive-latino-sine-flexione"
DESCRIPTION = "This package includes the documentation for texlive-latino-sine-flexione"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn69568"

RPM_NAME = "texlive-latino-sine-flexione-doc-2026.226.1.2svn69568-61.2.noarch.rpm"
RPM_HASH = "a5c860365cf1010d1e39fd84b2318aadb57d229619ae13194f53f71e7fd54e7aeff051c93c6057712fae7a0fa93a2dcd7db3188e19ddcb59e9489e1b6ca8a9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latino-sine-flexione-doc"

RDEPENDS:${PN} += ""

inherit rpm
