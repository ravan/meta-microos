SUMMARY = "Documentation for texlive-piton"
DESCRIPTION = "This package includes the documentation for texlive-piton"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.11svn77682"

RPM_NAME = "texlive-piton-doc-2026.226.4.11svn77682-58.2.noarch.rpm"
RPM_HASH = "5d98b572b0de83bef086f6f927277630107168144f7b781abe5d6dd45a7b7a0f0effe644f6ad667b387734fef9840842b96f9d7effb4ea03cccf9f9200e1504c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-piton-doc-fr \
texlive-piton-doc"

RDEPENDS:${PN} += ""

inherit rpm
