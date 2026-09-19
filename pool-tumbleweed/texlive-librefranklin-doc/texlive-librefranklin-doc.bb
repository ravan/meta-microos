SUMMARY = "Documentation for texlive-librefranklin"
DESCRIPTION = "This package includes the documentation for texlive-librefranklin"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-librefranklin-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "b4008b74b5c8f731991c1622f6fab71b501ffbcb8bd287cd780bc50539ecc504a356d9186e45ea6c54730912c5dd5238a700fd5558d58b76e7e199ebf421da9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librefranklin-doc"

RDEPENDS:${PN} += ""

inherit rpm
