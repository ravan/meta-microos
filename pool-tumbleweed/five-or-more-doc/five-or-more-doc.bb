SUMMARY = "Documentation for the 'Five or More' GNOME game"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package contains the help documentation for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "48.1+6"

RPM_NAME = "five-or-more-doc-48.1+6-1.2.noarch.rpm"
RPM_HASH = "8cc0b678a9b67935c746be79dbbdd56f2f39ae7a4ca7497bc598cd33ed8c057d437ef8dd9232bb9c361946786d32463a7667f6b2d441e228a327536b67becd2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "five-or-more-doc"

RDEPENDS:${PN} += ""

inherit rpm
