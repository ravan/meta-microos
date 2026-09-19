SUMMARY = "The Data Files for 0 AD"
DESCRIPTION = "0 A.D. (pronounced 'zero ey-dee') is a free, open-source, cross-platform real-time \
strategy (RTS) game of ancient warfare. In short, it is a historically-based \
war/economy game that allows players to relive or rewrite the history of Western \
civilizations, focusing on the years between 500 B.C. and 500 A.D. The project is \
highly ambitious, involving state-of-the-art 3D graphics, detailed artwork, sound, \
and a flexible and powerful custom-built game engine. \
 \
The game has been in development by Wildfire Games (WFG), a group of volunteer, \
hobbyist game developers, since 2001. The code and data are available under the GPL \
license, and the art, sound and documentation are available under CC-BY-SA."
LICENSE = "CC-BY-SA-3.0 & LPPL-1.3c+ & GPL-3.0-or-later"

PV = "0.28.0"

RPM_NAME = "0ad-data-0.28.0-1.2.noarch.rpm"
RPM_HASH = "7db9932dfe49b22cabf8b68d0db660e18a6b8fccf418d3f79e32ae6e9e82802ea5e8416f8bf6e39d26bcc6ae5cb05ec9b65b9eceaa7d27d6c073660eb497da74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "0ad-data"

RDEPENDS:${PN} += ""

inherit rpm
