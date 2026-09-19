SUMMARY = "A unique, custom designed font that has a very distinctive look and feel"
DESCRIPTION = "The Ubuntu Font Family are a set of matching new libre/open fonts. \
The development is being funded by Canonical on behalf the wider \
Free Software community and the Ubuntu project. The technical font \
design work and implementation is being undertaken by Dalton Maag. \
 \
Both the final font Truetype/OpenType files and the design files \
used to produce the font family are distributed under an open \
licence and you are expressly encouraged to experiment, modify, \
share and improve. The typeface is sans-serif, uses OpenType \
features and is manually hinted for clarity on desktop and \
mobile computing screens. \
 \
The scope of the Ubuntu Font Family includes all the languages \
used by the various Ubuntu users around the world in tune with \
Ubuntu's philosophy which states that every user should be able \
to use their software in the language of their choice. So the \
Ubuntu Font Family project will be extended to cover many more \
written languages."
LICENSE = "SUSE-Ubuntu-Font-License-1.0"

PV = "0.83"

RPM_NAME = "ubuntu-fonts-0.83-1.23.noarch.rpm"
RPM_HASH = "58f6cf349a953620782d03183221a5e0c9b5cc8d71165bc98409a4b4e096828b4021a17f07657b8586a6a147d97d96c649129fb78f48cdf755f62aaa87426b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
