SUMMARY = "Documentation for texlive-unisugar"
DESCRIPTION = "This package includes the documentation for texlive-unisugar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn22357"

RPM_NAME = "texlive-unisugar-doc-2026.226.0.0.92svn22357-60.2.noarch.rpm"
RPM_HASH = "3e4a926e6f231c244d3ef4c0d597f6a7bb72fe934b06afec35a0fdd89d834ab8302b591e7e13fbbef718e31e6e8bb6b8c5e7ad8b4b361218820388853b65752d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unisugar-doc"

RDEPENDS:${PN} += ""

inherit rpm
