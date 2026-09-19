SUMMARY = "Documentation for texlive-fontscale"
DESCRIPTION = "This package includes the documentation for texlive-fontscale"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0.0svn77912"

RPM_NAME = "texlive-fontscale-doc-2026.226.5.0.0svn77912-60.2.noarch.rpm"
RPM_HASH = "7d56571a3df32ea647b9d13ab3865295a59deec6100c34b014b4e926774e39a7bb7930cdafcbe340a00533b3bf79cf41d4288335a82d46ef3f8f9ad97930315d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontscale-doc"

RDEPENDS:${PN} += ""

inherit rpm
