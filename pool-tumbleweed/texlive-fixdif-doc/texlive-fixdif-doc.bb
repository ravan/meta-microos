SUMMARY = "Documentation for texlive-fixdif"
DESCRIPTION = "This package includes the documentation for texlive-fixdif"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn66606"

RPM_NAME = "texlive-fixdif-doc-2026.226.2.1svn66606-59.2.noarch.rpm"
RPM_HASH = "d7ada4d6caa743cb6e6287dad09d94687688f44ac27236e7d6667100055a97d5247f35396975c0b5a19c12da497ccb0c2889e159a297a43624177a202dd05c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fixdif-doc-zh \
texlive-fixdif-doc"

RDEPENDS:${PN} += ""

inherit rpm
