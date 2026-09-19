SUMMARY = "Documentation for texlive-subeqnarray"
DESCRIPTION = "This package includes the documentation for texlive-subeqnarray"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1fsvn77682"

RPM_NAME = "texlive-subeqnarray-doc-2026.226.2.1fsvn77682-64.2.noarch.rpm"
RPM_HASH = "14c48e8da81d7c267ca82c7c5f003025ee95a9605743f3aeb63baeaf7c493c61f244555821f3f84d2943daabc0631185feeeab1bbdec9c477ce733ec4f7bd04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subeqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
