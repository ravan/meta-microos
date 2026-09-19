SUMMARY = "Documentation for texlive-tzplot"
DESCRIPTION = "This package includes the documentation for texlive-tzplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77181"

RPM_NAME = "texlive-tzplot-doc-2026.226.2.2svn77181-59.2.noarch.rpm"
RPM_HASH = "0e6891f58b32ee2380990776b50b6478fb63a59ec61bc1bb670e87b06c62ecd00f3221ef0cccf117dfa2b3e140f6fb0e78760b9089f889dc70b874051bc79ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tzplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
