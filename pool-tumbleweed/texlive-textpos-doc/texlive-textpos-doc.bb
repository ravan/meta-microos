SUMMARY = "Documentation for texlive-textpos"
DESCRIPTION = "This package includes the documentation for texlive-textpos"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.10.1svn77682"

RPM_NAME = "texlive-textpos-doc-2026.227.1.10.1svn77682-62.2.noarch.rpm"
RPM_HASH = "520c8a33f667d7b4264f0f56e89171b168ebce382a3c14c84898140ec049b361edd679a2b8ea72832fd382af561810884abfc712d649ef7cb95bfed6b25bd5fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textpos-doc"

RDEPENDS:${PN} += ""

inherit rpm
