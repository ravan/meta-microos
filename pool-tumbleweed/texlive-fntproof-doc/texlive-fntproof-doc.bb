SUMMARY = "Documentation for texlive-fntproof"
DESCRIPTION = "This package includes the documentation for texlive-fntproof"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20638"

RPM_NAME = "texlive-fntproof-doc-2026.226.svn20638-60.2.noarch.rpm"
RPM_HASH = "b692f6b5c16424f5c6d416bfc10449555c2bd1a16bd34bc6f028268d268cfb1d3743e63d2ba93cd62a313ddaa410dc9efbcd85f5e8ef4e946be3039c1d78d6d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fntproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
