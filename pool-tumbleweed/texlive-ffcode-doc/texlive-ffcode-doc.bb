SUMMARY = "Documentation for texlive-ffcode"
DESCRIPTION = "This package includes the documentation for texlive-ffcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11.0svn75716"

RPM_NAME = "texlive-ffcode-doc-2026.226.0.0.11.0svn75716-59.2.noarch.rpm"
RPM_HASH = "a1aae51896a18896d4a7a302b4efca7b6f29f802c3d7b689ddb59eaff49ac5982bef5036e7bda1307b1606c917f449f11f19a7659626f8115546b8b01512ac70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ffcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
