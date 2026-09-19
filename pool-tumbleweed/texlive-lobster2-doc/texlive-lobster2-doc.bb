SUMMARY = "Documentation for texlive-lobster2"
DESCRIPTION = "This package includes the documentation for texlive-lobster2"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-lobster2-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "185c367bece40f9f8295eb2cf17462d7a95ce04dd34fb0986de674bbfee37cc76d7a693bea6dac86344cb0d9ce2594424c240eb60c894633c9d13cbc09498945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lobster2-doc"

RDEPENDS:${PN} += ""

inherit rpm
