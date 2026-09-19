SUMMARY = "Documentation for texlive-shdoc"
DESCRIPTION = "This package includes the documentation for texlive-shdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1bsvn41991"

RPM_NAME = "texlive-shdoc-doc-2026.226.2.1bsvn41991-60.2.noarch.rpm"
RPM_HASH = "4dff44e1a759e935db6f725ec14927be6704d13aef11c22e79be8516c9bfba2671390e9ef60c7b31ec00d52a235c24611b32c6fc7fbcbe6b9f61200cc401f306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shdoc-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
