SUMMARY = "Documentation for texlive-spverbatim"
DESCRIPTION = "This package includes the documentation for texlive-spverbatim"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-spverbatim-doc-2026.226.1.0svn77682-64.2.noarch.rpm"
RPM_HASH = "60fbcd6577b70df19f3f040a8bc6f08ca346117596539a17c76f6399ff979fd3c41022cc70051082ac4f79a500d050dc57d43f1249c840756689828d897042a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spverbatim-doc"

RDEPENDS:${PN} += ""

inherit rpm
