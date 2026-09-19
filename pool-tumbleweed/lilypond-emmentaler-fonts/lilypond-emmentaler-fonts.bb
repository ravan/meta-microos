SUMMARY = "Lilypond emmentaler fonts"
DESCRIPTION = "LilyPond is an automated music engraving system. It formats music \
beautifully and automatically, and has a friendly syntax for its input \
files. \
These are the lilypond emmentaler fonts."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.4"

RPM_NAME = "lilypond-emmentaler-fonts-2.24.4-1.19.noarch.rpm"
RPM_HASH = "c7b50b486ee331c4d2b2c61af366b19cbc1d238b9f2c22ac3e9a8299d2b629f5ee25e1dd20949d747dc4a20d19badee2f501450e9aa2ca802484bbfec410166f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-emmentaler-11 \
font-emmentaler-13 \
font-emmentaler-14 \
font-emmentaler-16 \
font-emmentaler-18 \
font-emmentaler-20 \
font-emmentaler-23 \
font-emmentaler-26 \
font-emmentaler-brace \
lilypond-emmentaler-fonts"

RDEPENDS:${PN} += ""

inherit rpm
