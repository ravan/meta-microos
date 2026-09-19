SUMMARY = "Documentation for texlive-kerntest"
DESCRIPTION = "This package includes the documentation for texlive-kerntest"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.32svn15878"

RPM_NAME = "texlive-kerntest-doc-2026.226.1.32svn15878-63.2.noarch.rpm"
RPM_HASH = "2540cd1065a34522dbcc6574c06a58df2836d4c7a0f520865b7602054f8f30b95008a01229c1f4939dfd3b4c9968d70880b45508aed3a587c9eb58f4aece9c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kerntest-doc"

RDEPENDS:${PN} += ""

inherit rpm
