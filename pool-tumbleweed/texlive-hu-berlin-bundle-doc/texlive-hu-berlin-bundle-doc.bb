SUMMARY = "Documentation for texlive-hu-berlin-bundle"
DESCRIPTION = "This package includes the documentation for texlive-hu-berlin-bundle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn76790"

RPM_NAME = "texlive-hu-berlin-bundle-doc-2026.226.1.1.2svn76790-60.2.noarch.rpm"
RPM_HASH = "bf237e89028946758f5fd630fd48d3f1adcba213dc09417da4462adb7c7567fd2135bd5c0b11bc1c1643c1be6dd3e47bd86013fb291f9e7e0f959fa272ad8e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hu-berlin-bundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
