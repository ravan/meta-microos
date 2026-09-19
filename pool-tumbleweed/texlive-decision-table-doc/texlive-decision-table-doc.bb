SUMMARY = "Documentation for texlive-decision-table"
DESCRIPTION = "This package includes the documentation for texlive-decision-table"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.4svn76924"

RPM_NAME = "texlive-decision-table-doc-2026.226.0.0.0.4svn76924-59.2.noarch.rpm"
RPM_HASH = "6af8abaebabbdff92bd2b101b73849344044a061d95abcd3bdece1854a624e44a61dec4079bc0873c3bc39eeeabb554cbe2d672465c60e443c8afb01f3691688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decision-table-doc"

RDEPENDS:${PN} += ""

inherit rpm
