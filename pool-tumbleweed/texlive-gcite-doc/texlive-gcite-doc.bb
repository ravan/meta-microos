SUMMARY = "Documentation for texlive-gcite"
DESCRIPTION = "This package includes the documentation for texlive-gcite"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn15878"

RPM_NAME = "texlive-gcite-doc-2026.226.1.0.1svn15878-60.2.noarch.rpm"
RPM_HASH = "5719fb76c898d8c0be69b3994f2285b68e24da40428428f2f57a1ef66a75c0d9f6eac1c785f84f57e6fa39ce9c1166512457b8d042da4a3fa66ff348093b861d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
