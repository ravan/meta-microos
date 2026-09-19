SUMMARY = "Documentation for texlive-hershey-mp"
DESCRIPTION = "This package includes the documentation for texlive-hershey-mp"
LICENSE = "LPPL-1.0"

PV = "2026.226.2022_1.0svn70885"

RPM_NAME = "texlive-hershey-mp-doc-2026.226.2022_1.0svn70885-60.4.noarch.rpm"
RPM_HASH = "3f068fd630c0b141d26c0d0652476ae6063f51505392f33c558cd75be04046918c8ed39265561f1e2e78c9f480aee563535d1e99b208cfcb35a9bced08eeef1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
