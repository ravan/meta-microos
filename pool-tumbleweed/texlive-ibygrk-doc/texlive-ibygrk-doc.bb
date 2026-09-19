SUMMARY = "Documentation for texlive-ibygrk"
DESCRIPTION = "This package includes the documentation for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.5svn15878"

RPM_NAME = "texlive-ibygrk-doc-2026.226.4.5svn15878-60.2.noarch.rpm"
RPM_HASH = "16f150539a98589c0c8315ca2f35fb59c0c8dbab83be379767ca0b02451f204ead4f6d6844e97d93b4159cac1edda6a117cae1a110b2ef43171abce79e1b10b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibygrk-doc"

RDEPENDS:${PN} += ""

inherit rpm
