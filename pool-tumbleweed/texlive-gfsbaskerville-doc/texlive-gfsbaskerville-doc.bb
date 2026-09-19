SUMMARY = "Documentation for texlive-gfsbaskerville"
DESCRIPTION = "This package includes the documentation for texlive-gfsbaskerville"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfsbaskerville-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "0d2660b7496431b8c52110037aaff4f1565678627a4cc306bd2316b1386575710dc861143cadd0005ceb93463d9501794f10ea432c76c71d694d8a66bd59ab9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsbaskerville-doc"

RDEPENDS:${PN} += ""

inherit rpm
