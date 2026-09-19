SUMMARY = "Documentation for texlive-fancyhandout"
DESCRIPTION = "This package includes the documentation for texlive-fancyhandout"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46411"

RPM_NAME = "texlive-fancyhandout-doc-2026.226.svn46411-59.2.noarch.rpm"
RPM_HASH = "aa2156d85e04cd8d2b1ef69bfd8c04ce93a6947381b9d0c91d6537ab9d635d85bd747b1374dc0836aa58d92667d1270eef325cc85f4a57d8deadad16a7c9ced9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhandout-doc"

RDEPENDS:${PN} += ""

inherit rpm
