SUMMARY = "Documentation for texlive-beamertheme-csh"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-csh"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76967"

RPM_NAME = "texlive-beamertheme-csh-doc-2026.226.1.1svn76967-61.2.noarch.rpm"
RPM_HASH = "23978b3decbd3504c62ff2df0d2a77edff6fa8796298c975a0088c9f3c7370c6fa224f1cf23d287d1cc6b79b798e3ebff38255f7ba8876402d59a577f3f55ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-csh-doc"

RDEPENDS:${PN} += ""

inherit rpm
