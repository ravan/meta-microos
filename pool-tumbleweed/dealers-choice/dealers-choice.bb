SUMMARY = "Online Multiplayer Stud and Draw Poker, Texas Hold'em and Omaha"
DESCRIPTION = "Dealer's Choice is a cross-platform, networked multiplayer poker game \
supporting draw, stud, and community-card variants, including Texas Hold'em \
and Omaha, with optional wild cards. The deal rotates around the table, and \
the dealer chooses the game before each hand."
LICENSE = "MIT"

PV = "0.0.15"

RPM_NAME = "dealers-choice-0.0.15-1.2.aarch64.rpm"
RPM_HASH = "f4c8c6688a7b5184464e64350058ed3d37f68c2aab6541d33244971ceb69f50269d364106e5ae42b0bc316d8a8539e7faffa4a8a1c0905204c3752213d6de0d2"

RPROVIDES:${PN} += "dealers-choice"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcanfigger.so.0 \
libm.so.6 \
libpcg-c.so.0 \
libprotobuf-c.so.1 \
libsodium.so.26"

inherit rpm
