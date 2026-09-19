SUMMARY = "Documentation for texlive-pst-vectorian"
DESCRIPTION = "This package includes the documentation for texlive-pst-vectorian"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.42svn78101"

RPM_NAME = "texlive-pst-vectorian-doc-2026.226.0.0.42svn78101-60.4.noarch.rpm"
RPM_HASH = "f6533039e512b1b28796ecb66ec1d322f826260eb12d9f35cc16937473e2975c59caf49f823fafc8907ec91dbf8587b8671848c9626bf538e4e0a66227d6fd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vectorian-doc-fr \
texlive-pst-vectorian-doc"

RDEPENDS:${PN} += ""

inherit rpm
