SUMMARY = "Documentation for texlive-callouts-box"
DESCRIPTION = "This package includes the documentation for texlive-callouts-box"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn74635"

RPM_NAME = "texlive-callouts-box-doc-2026.226.1.1svn74635-59.2.noarch.rpm"
RPM_HASH = "e75ba8a4cab7ac58d18dfb1e9999bf30d045c0bf9c2c07ee0d7255a4409077884710b3ad992688aa9b4f7257322adc6f8088f0df8d6497e99bf15f3810424720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-callouts-box-doc"

RDEPENDS:${PN} += ""

inherit rpm
