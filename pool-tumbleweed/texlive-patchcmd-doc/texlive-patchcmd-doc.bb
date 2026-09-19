SUMMARY = "Documentation for texlive-patchcmd"
DESCRIPTION = "This package includes the documentation for texlive-patchcmd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn78101"

RPM_NAME = "texlive-patchcmd-doc-2026.226.1.05svn78101-58.2.noarch.rpm"
RPM_HASH = "d21e8d48a1489d22352f64c8a1bed7f5077804ce11a129e7ac0d7192e351bea3d0066db3ed22203d385f98c0932135160747fb0b834372889c6a59bbeb752e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patchcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
