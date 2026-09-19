SUMMARY = "Documentation for texlive-sourcecodepro"
DESCRIPTION = "This package includes the documentation for texlive-sourcecodepro"
LICENSE = "OFL-1.1"

PV = "2026.226.2.8svn77682"

RPM_NAME = "texlive-sourcecodepro-doc-2026.226.2.8svn77682-64.2.noarch.rpm"
RPM_HASH = "f2d6a1cdd65caf6a46767c11d14aa4de243cef35029d2d82bbc43d7ee0db107ded5be48c9c8be0eab3ead3f127160bc7ce3c8b6eb590cdac0d3d7c66caf7e734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourcecodepro-doc"

RDEPENDS:${PN} += ""

inherit rpm
