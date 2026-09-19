SUMMARY = "Documentation for texlive-hvqrurl"
DESCRIPTION = "This package includes the documentation for texlive-hvqrurl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.09svn71361"

RPM_NAME = "texlive-hvqrurl-doc-2026.226.0.0.09svn71361-60.2.noarch.rpm"
RPM_HASH = "71b8af0a817b17cff1a397d57cebf7e68f8350d7917d1561fec4f5733a04479a8e39c08d239aef9f2f8f87e16ca3156bb5fa510cb009995f3350556bb5a9b2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvqrurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
