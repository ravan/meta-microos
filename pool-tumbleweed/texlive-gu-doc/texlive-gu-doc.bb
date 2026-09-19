SUMMARY = "Documentation for texlive-gu"
DESCRIPTION = "This package includes the documentation for texlive-gu"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-gu-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "8ca7de394eea294f267404f4564ce3b8646398ee983bd30eeaa97920b011a4cebb9abbef8ebf7b8d23dac8021cdcd85c192907575f7750764389022b94ce8356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gu-doc-de \
texlive-gu-doc"

RDEPENDS:${PN} += ""

inherit rpm
