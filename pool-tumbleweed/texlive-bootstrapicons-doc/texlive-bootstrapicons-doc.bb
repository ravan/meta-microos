SUMMARY = "Documentation for texlive-bootstrapicons"
DESCRIPTION = "This package includes the documentation for texlive-bootstrapicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76502"

RPM_NAME = "texlive-bootstrapicons-doc-2026.226.1.1svn76502-59.2.noarch.rpm"
RPM_HASH = "3e680e19bfe3cd164d6974ace5c4944480310b5f5d036a2ede0561ba052afb3266e044d1a95d85889fd8f050b344af03f9c9aa3dc71acc79ec9a394eff31bf57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bootstrapicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
