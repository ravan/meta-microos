SUMMARY = "Documentation for texlive-sudokubundle"
DESCRIPTION = "This package includes the documentation for texlive-sudokubundle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn78101"

RPM_NAME = "texlive-sudokubundle-doc-2026.226.1.0asvn78101-64.2.noarch.rpm"
RPM_HASH = "90d654bffe43d76737eb8130a1d7d8b1d28de8201b368bd697c2dde0eac08edc1660f20422f95aaa2de0270684041fa139ad1f4f3b692dcde93bb8729bdcc262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sudokubundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
