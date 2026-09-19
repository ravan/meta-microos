SUMMARY = "Documentation for texlive-llncsconf"
DESCRIPTION = "This package includes the documentation for texlive-llncsconf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn63136"

RPM_NAME = "texlive-llncsconf-doc-2026.226.1.2.0svn63136-61.2.noarch.rpm"
RPM_HASH = "81c12ee6899791456b6b0b9f3cb84b22c344e29f1416c809da730fd1fc4a95026a44a5d3ac98c77d1620ee7b46dd86615c0977a1c86225ff13b4993bcdb8c4ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-llncsconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
