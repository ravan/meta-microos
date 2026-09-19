SUMMARY = "Documentation for texlive-alphalph"
DESCRIPTION = "This package includes the documentation for texlive-alphalph"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-alphalph-doc-2026.226.2.6svn77682-61.2.noarch.rpm"
RPM_HASH = "4b5769b967c852c8fb45aeec59d6288edf1d91bfc234fc6d5e9fc2079492044b54160b9c5fcbe11590c7f1dcf8fc038c5010d0c33688435e51c8f625745be0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alphalph-doc"

RDEPENDS:${PN} += ""

inherit rpm
