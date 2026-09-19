SUMMARY = "Documentation for texlive-pst-math"
DESCRIPTION = "This package includes the documentation for texlive-pst-math"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.67svn77682"

RPM_NAME = "texlive-pst-math-doc-2026.226.0.0.67svn77682-59.2.noarch.rpm"
RPM_HASH = "d661c75877c4d710695de540fbeb28dd60e60ea71be63dee8a0df17652723bcfc1a0156637314bd74eab62977c6299f2dd6b73b4fe6c0d90320a53b29d5a1328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
