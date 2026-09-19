SUMMARY = "Documentation for texlive-stepgreek"
DESCRIPTION = "This package includes the documentation for texlive-stepgreek"
LICENSE = "OFL-1.1"

PV = "2026.226.3.0b1svn57074"

RPM_NAME = "texlive-stepgreek-doc-2026.226.3.0b1svn57074-64.2.noarch.rpm"
RPM_HASH = "30d14be64d00e6cbafc3457bba37b6916d8554224a96bb62e7cf63e86395bba7fbdd9d5bf0310e9aa5e7d2f77cd1572d2e809d016c7180698c209be0fbb2cf80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stepgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
