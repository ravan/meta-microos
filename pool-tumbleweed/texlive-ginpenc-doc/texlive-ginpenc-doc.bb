SUMMARY = "Documentation for texlive-ginpenc"
DESCRIPTION = "This package includes the documentation for texlive-ginpenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24980"

RPM_NAME = "texlive-ginpenc-doc-2026.226.1.0svn24980-60.2.noarch.rpm"
RPM_HASH = "4951de5faf5b8fb8317fc801201d5e4486d9c95f9bd7643525f3be818bd3c02edc8cc8450ab570d98e5880aab2be2e25a3726f3dbe10b831b295bfbd24c333fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ginpenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
