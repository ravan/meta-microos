SUMMARY = "Documentation for texlive-fontawesome6"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome6"
LICENSE = "OFL-1.1"

PV = "2026.226.6.7.2_3svn77682"

RPM_NAME = "texlive-fontawesome6-doc-2026.226.6.7.2_3svn77682-60.2.noarch.rpm"
RPM_HASH = "c0ca4dd46a078a46538f6502c63ebeb8ec4f35a0a1fd7359cc90d07d80db9dc21ff86a88b8977a2ae37402e59f298f1ff39f610b6fef3667b1be3bcb5fd016fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome6-doc"

RDEPENDS:${PN} += ""

inherit rpm
