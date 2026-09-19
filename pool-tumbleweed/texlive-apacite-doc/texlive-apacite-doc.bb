SUMMARY = "Documentation for texlive-apacite"
DESCRIPTION = "This package includes the documentation for texlive-apacite"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.03svn77682"

RPM_NAME = "texlive-apacite-doc-2026.226.6.03svn77682-61.2.noarch.rpm"
RPM_HASH = "0f89301f0d4c6f2ffa3955cc32643f319db7dbca768ff5a674990ce5d6257d294bf79a9cb79754666a948260c56f02ad782d7bc8c512f809ba4b0f30ec95706b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apacite-doc"

RDEPENDS:${PN} += ""

inherit rpm
