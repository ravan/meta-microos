SUMMARY = "Documentation for texlive-luahyphenrules"
DESCRIPTION = "This package includes the documentation for texlive-luahyphenrules"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn78101"

RPM_NAME = "texlive-luahyphenrules-doc-2026.226.1.1svn78101-59.2.noarch.rpm"
RPM_HASH = "708d1789eec528d61a703775576191583972d7ce369245c99a4450771cbd672edaf196464c1d74e0cba3a1132a75841d7621360171d39f78747e62e4f4c1ce92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luahyphenrules-doc"

RDEPENDS:${PN} += ""

inherit rpm
