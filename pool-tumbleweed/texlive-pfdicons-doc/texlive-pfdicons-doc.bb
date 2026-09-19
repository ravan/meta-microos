SUMMARY = "Documentation for texlive-pfdicons"
DESCRIPTION = "This package includes the documentation for texlive-pfdicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77771"

RPM_NAME = "texlive-pfdicons-doc-2026.226.1.1svn77771-58.2.noarch.rpm"
RPM_HASH = "630a228151af611cddea3f56c9c872b0ada86a93a25d3a2f772a3c9bea35be4054aa3fbc6d1e288c261241c46e7390781f37df07e3f553b2b762e85ea47a3678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pfdicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
