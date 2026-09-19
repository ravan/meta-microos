SUMMARY = "Documentation for texlive-exam"
DESCRIPTION = "This package includes the documentation for texlive-exam"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.704svn77682"

RPM_NAME = "texlive-exam-doc-2026.226.2.704svn77682-59.2.noarch.rpm"
RPM_HASH = "d6161dc9a717e32682082743c60033a36c1a5f4bf5eb1980ff1a0e57846b9779d46ed882f5f4d75aa2fd7b08152cb967148d7c8309ef77e08d0d51f325d1393e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-doc"

RDEPENDS:${PN} += ""

inherit rpm
