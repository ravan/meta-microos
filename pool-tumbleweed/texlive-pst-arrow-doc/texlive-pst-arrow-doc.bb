SUMMARY = "Documentation for texlive-pst-arrow"
DESCRIPTION = "This package includes the documentation for texlive-pst-arrow"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.05svn61069"

RPM_NAME = "texlive-pst-arrow-doc-2026.226.0.0.05svn61069-59.2.noarch.rpm"
RPM_HASH = "11383cc4514df75784d60c6427724997c1c0a6651ce61d08c261f8b6891ad7b98e79df14675096fd0df87956ebc91af46ad09a6f041555a53d91cf2641ea6704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-arrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
