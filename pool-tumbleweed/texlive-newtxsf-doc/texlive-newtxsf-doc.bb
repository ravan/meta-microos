SUMMARY = "Documentation for texlive-newtxsf"
DESCRIPTION = "This package includes the documentation for texlive-newtxsf"
LICENSE = "OFL-1.1"

PV = "2026.226.1.056svn77682"

RPM_NAME = "texlive-newtxsf-doc-2026.226.1.056svn77682-61.2.noarch.rpm"
RPM_HASH = "14607d1376f500db859948e77f6486360ba75ac6ce5f4ed9f4d53cac19dd28ecfc8ce78885a6afa64537ce23324556c6281cda5bbf8e4164dc755b89cfa1e405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtxsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
