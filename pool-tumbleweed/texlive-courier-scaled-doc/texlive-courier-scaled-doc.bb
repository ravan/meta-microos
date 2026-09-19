SUMMARY = "Documentation for texlive-courier-scaled"
DESCRIPTION = "This package includes the documentation for texlive-courier-scaled"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-courier-scaled-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "adbf657407bb4ca9eaf4a78d47de0bfecc151011dc16796e6faaca84f7896519365a42253da44037744ed35b1d4783e5d19f0e9cbbe9694abdb9bead2d5bbe55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courier-scaled-doc"

RDEPENDS:${PN} += ""

inherit rpm
