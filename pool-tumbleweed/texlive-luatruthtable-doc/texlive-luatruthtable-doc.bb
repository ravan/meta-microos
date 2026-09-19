SUMMARY = "Documentation for texlive-luatruthtable"
DESCRIPTION = "This package includes the documentation for texlive-luatruthtable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-luatruthtable-doc-2026.226.1.3svn76924-59.2.noarch.rpm"
RPM_HASH = "40abdc6e974e589958672397673faa5539eef208fc356e3fc36b4af80f483d0eea98d297f8fe0b36cf73c75624424f681d899df3994bb9cad2a1bf5b547f0e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatruthtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
