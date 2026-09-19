SUMMARY = "Documentation for texlive-traffic-light-protocol"
DESCRIPTION = "This package includes the documentation for texlive-traffic-light-protocol"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-traffic-light-protocol-doc-2026.226.0.0.2svn76924-59.2.noarch.rpm"
RPM_HASH = "ac988bcc4f9e8ef42812fb4a7d4192f3fef706931e24c80246d0bd9a51ca286c9b189d6c9c5d38b227a518d1f28a4a14512492a82d1801e3e3504cfbc3099954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-traffic-light-protocol-doc"

RDEPENDS:${PN} += ""

inherit rpm
