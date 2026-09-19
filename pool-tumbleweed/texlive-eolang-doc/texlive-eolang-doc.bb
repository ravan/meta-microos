SUMMARY = "Documentation for texlive-eolang"
DESCRIPTION = "This package includes the documentation for texlive-eolang"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23.0svn77164"

RPM_NAME = "texlive-eolang-doc-2026.226.0.0.23.0svn77164-61.4.noarch.rpm"
RPM_HASH = "1976bed6a57f266787180f29c312db97cf3dcdc5012730913d04917ae3455c977f9a59f77c1717ed6a161aebe72a047a82cffb00c3bbd069d36e43f78623ca68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eolang.1 \
texlive-eolang-doc"

RDEPENDS:${PN} += ""

inherit rpm
