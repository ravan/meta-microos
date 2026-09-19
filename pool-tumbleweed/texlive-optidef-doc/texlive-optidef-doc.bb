SUMMARY = "Documentation for texlive-optidef"
DESCRIPTION = "This package includes the documentation for texlive-optidef"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn50941"

RPM_NAME = "texlive-optidef-doc-2026.226.3.1svn50941-61.2.noarch.rpm"
RPM_HASH = "fbdecb1c20825da0ce035fc108ff1d263ef7251b2c845f9fb1e74ede8e0d73f9445b067cdb439b1ee982d480040b3a63bbdc9dcef7d4059f828ca1dcaa8637c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optidef-doc"

RDEPENDS:${PN} += ""

inherit rpm
