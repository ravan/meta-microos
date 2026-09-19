SUMMARY = "Documentation for texlive-datetime2-it-fulltext"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-it-fulltext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn54779"

RPM_NAME = "texlive-datetime2-it-fulltext-doc-2026.226.1.6svn54779-59.2.noarch.rpm"
RPM_HASH = "cbd61502cd9ff8a6e34bb12b430a505b145acf17edbe155eae273c60bf57a53c84b90e4e68b1ef55d727bf3ebef4b5d79c8bdee3b84555e546cb420f5200ea15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-it-fulltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
