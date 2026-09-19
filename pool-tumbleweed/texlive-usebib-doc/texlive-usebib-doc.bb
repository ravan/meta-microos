SUMMARY = "Documentation for texlive-usebib"
DESCRIPTION = "This package includes the documentation for texlive-usebib"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-usebib-doc-2026.226.1.0asvn77682-60.2.noarch.rpm"
RPM_HASH = "48cf569b689f30108f2e1e21afadeff4d5dd6cdc3ba27279dea5301831e40e0226de1177662387b43b4d94c28472cc4e741378458ddc1c163a56b05785341ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-usebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
