SUMMARY = "Lilypond fonts common dir"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
This contains the directory common to all lilypond fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-fonts-common-2.24.4-1.19.noarch.rpm"
RPM_HASH = "10149fb94b72cca765395df0f9c2b74f8499256e92405ff1656d19027e8ab636642888417740eabb7ea8408c5ec9bea02b3c1c7568f30e886767074266a2da15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lilypond-fonts-common"

RDEPENDS:${PN} += "lilypond-emmentaler-fonts"

inherit rpm
