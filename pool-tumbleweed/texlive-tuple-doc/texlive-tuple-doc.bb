SUMMARY = "Documentation for texlive-tuple"
DESCRIPTION = "This package includes the documentation for texlive-tuple"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn78219"

RPM_NAME = "texlive-tuple-doc-2026.226.0.0.2svn78219-59.2.noarch.rpm"
RPM_HASH = "f2ceb707e3cf347bca18806d2d4b26ab2175a683e4d8779a4be8e3b43a3a84b69a0abeb0e10c865639caf7df044c20e65161b50f856efe23b431246c025ce02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tuple-doc-fr \
texlive-tuple-doc"

RDEPENDS:${PN} += ""

inherit rpm
