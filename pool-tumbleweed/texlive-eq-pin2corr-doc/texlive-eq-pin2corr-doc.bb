SUMMARY = "Documentation for texlive-eq-pin2corr"
DESCRIPTION = "This package includes the documentation for texlive-eq-pin2corr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59477"

RPM_NAME = "texlive-eq-pin2corr-doc-2026.226.svn59477-61.4.noarch.rpm"
RPM_HASH = "4eb2716df6d206e1b3e65cda2efb69f4b4d3d9c51696a803860f1b8ecd3d82978abb52084d6b44a307d57e008e9e93c2ce427cee0942ab72e16ffa3d8dd0c624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eq-pin2corr-doc"

RDEPENDS:${PN} += ""

inherit rpm
