SUMMARY = "Documentation for texlive-coelacanth"
DESCRIPTION = "This package includes the documentation for texlive-coelacanth"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.005svn77682"

RPM_NAME = "texlive-coelacanth-doc-2026.226.0.0.005svn77682-60.2.noarch.rpm"
RPM_HASH = "bb3d2014d523ae783871525264975a03c88e049f234476693df3dcf807a987b3e31a08ec3ee4099632062a540e37c5554056926475415c65a9a0e9156609f5a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coelacanth-doc"

RDEPENDS:${PN} += ""

inherit rpm
