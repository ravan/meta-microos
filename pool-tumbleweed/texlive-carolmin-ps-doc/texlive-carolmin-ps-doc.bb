SUMMARY = "Documentation for texlive-carolmin-ps"
DESCRIPTION = "This package includes the documentation for texlive-carolmin-ps"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-carolmin-ps-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "d91d6f5701024b50efc850113124dffb1e27d5541722265ec4d4af191dfe88e555b5a6bb14f209add2b7c7ddbe45b5886ce10879ce51098169662a52fd934cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carolmin-ps-doc"

RDEPENDS:${PN} += ""

inherit rpm
