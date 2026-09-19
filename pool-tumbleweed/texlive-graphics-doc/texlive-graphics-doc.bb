SUMMARY = "Documentation for texlive-graphics"
DESCRIPTION = "This package includes the documentation for texlive-graphics"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75374"

RPM_NAME = "texlive-graphics-doc-2026.226.svn75374-60.4.noarch.rpm"
RPM_HASH = "038c29c3fce72a035256428507bbf8dd4c8a646a2512715b4b2b48dc640e3176ae033c346ae8986e9693d4580934ac53e99bb423baec39d03fb31ff96062ab61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
