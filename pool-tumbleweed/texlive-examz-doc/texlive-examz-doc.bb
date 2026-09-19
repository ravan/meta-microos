SUMMARY = "Documentation for texlive-examz"
DESCRIPTION = "This package includes the documentation for texlive-examz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn67303"

RPM_NAME = "texlive-examz-doc-2026.226.1.0.0svn67303-59.2.noarch.rpm"
RPM_HASH = "60e3bc0fd26fa645d24ffe346be3678776194cdb51160438133f3a5c3ef2360063e05eb947373f31bfc11f8444334f380390717840ddb8f8f5f90e975f391051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examz-doc"

RDEPENDS:${PN} += ""

inherit rpm
