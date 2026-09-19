SUMMARY = "Documentation for texlive-xlop"
DESCRIPTION = "This package includes the documentation for texlive-xlop"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.28svn77682"

RPM_NAME = "texlive-xlop-doc-2026.226.0.0.28svn77682-59.4.noarch.rpm"
RPM_HASH = "54561be2d988d6a67354c738c92240d46b43806c2ab64db0e02bb6051e5ea170675566c0f80e42b26632f3db6c970f23db15fde9a57bfec93dddc6c7b8b711fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xlop-doc-fr;en \
texlive-xlop-doc"

RDEPENDS:${PN} += ""

inherit rpm
