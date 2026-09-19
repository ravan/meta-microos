SUMMARY = "Documentation for texlive-pm-isomath"
DESCRIPTION = "This package includes the documentation for texlive-pm-isomath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.00svn76924"

RPM_NAME = "texlive-pm-isomath-doc-2026.226.1.2.00svn76924-59.2.noarch.rpm"
RPM_HASH = "c658cec4e30f49e27ce23ef1df61dbf7f56e7a568bbe890bae81a3369cee845c2978d96c77f8b3325ec7af68dbedd45858beef038d87043380183ca3f0bfb17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pm-isomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
