SUMMARY = "Documentation for texlive-puyotikz"
DESCRIPTION = "This package includes the documentation for texlive-puyotikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-doc-2026.226.1.0.1svn57254-60.4.noarch.rpm"
RPM_HASH = "96088e1874b183deb88e38644db45cad94951846b202c571aa85b64c020798810eefdbb0d3ff8d835914465fd29e8b4f0d075c0d6430891a6541d78c1bd45756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-puyotikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
