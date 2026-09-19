SUMMARY = "Documentation for texlive-mparhack"
DESCRIPTION = "This package includes the documentation for texlive-mparhack"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-mparhack-doc-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "018d879b34ee55051e051abb44fabaa56dd472f061cd7eb01820806bf8c92d04d1ce665f787bacc35b9778c7e647ae7afa9c88c40d5106d15f155d4e894fda9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparhack-doc"

RDEPENDS:${PN} += ""

inherit rpm
