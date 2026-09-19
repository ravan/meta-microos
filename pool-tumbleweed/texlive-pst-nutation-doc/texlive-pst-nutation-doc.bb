SUMMARY = "Documentation for texlive-pst-nutation"
DESCRIPTION = "This package includes the documentation for texlive-pst-nutation"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77145"

RPM_NAME = "texlive-pst-nutation-doc-2026.226.0.0.01svn77145-59.2.noarch.rpm"
RPM_HASH = "e84b9e0356b12ac01912556adb5266f6a1e2f7bcf4e016c347666a6c5811137991c5b88ffa4ce7e8e1ad9dab5b778191f30e2ed4004b268e355b5294d5018af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-nutation-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
