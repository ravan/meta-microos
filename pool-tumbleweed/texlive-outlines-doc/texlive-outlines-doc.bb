SUMMARY = "Documentation for texlive-outlines"
DESCRIPTION = "This package includes the documentation for texlive-outlines"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-outlines-doc-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "ea29ea83eec338848adebe4856f1a167efa3b404a6fba8b164f12f4fb890a29d7467c0a602df9a1a355ebfd215efc748f4947a6af5592b6167f635bf4a955428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
