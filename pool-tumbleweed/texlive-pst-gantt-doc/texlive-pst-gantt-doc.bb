SUMMARY = "Documentation for texlive-pst-gantt"
DESCRIPTION = "This package includes the documentation for texlive-pst-gantt"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.22asvn35832"

RPM_NAME = "texlive-pst-gantt-doc-2026.226.0.0.22asvn35832-59.2.noarch.rpm"
RPM_HASH = "f48ede5887e8ecba86c53c15088e12113b4c41aed70656a475ccfa25bb6eac640880a47b1c3548a86f28397d95fd4a5754ba613edc0f3bae28677748ca4e0e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
