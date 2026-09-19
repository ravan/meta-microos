SUMMARY = "Documentation for texlive-hfutthesis"
DESCRIPTION = "This package includes the documentation for texlive-hfutthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-doc-2026.226.1.0.4svn64025-60.4.noarch.rpm"
RPM_HASH = "3991e532a383f34b2448ad3fb9148c62e599b9139658e398cefbb393f08a2443c8a8764f9084c28091cbafb1aae266dc0098d62ada807cd49995e8b6cbeb0896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hfutthesis-doc-zh \
texlive-hfutthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
