SUMMARY = "Documentation for texlive-nuc"
DESCRIPTION = "This package includes the documentation for texlive-nuc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn22256"

RPM_NAME = "texlive-nuc-doc-2026.226.0.0.1svn22256-61.2.noarch.rpm"
RPM_HASH = "089b792a86a7ce8234a46154d4db1a1b5bc6d46cb3ad3b8064d1715f30b5baa550b7ce82e9e77f2451376ee25977292ad81bbd50b39cf54da2dfdc409e30f898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nuc-doc"

RDEPENDS:${PN} += ""

inherit rpm
