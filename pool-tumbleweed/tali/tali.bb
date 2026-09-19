SUMMARY = "Yahtzee Game for GNOME"
DESCRIPTION = "Tali is like Yahtzee, or like poker with dice. The player rolls dice \
to try to make the best possible combinations, like 4 of a kind, small \
straight, and full house. The player is allowed 3 rolls per turn and \
can hold certain dice with each roll."
LICENSE = "GPL-2.0-or-later"

PV = "40.9+8"

RPM_NAME = "tali-40.9+8-1.3.aarch64.rpm"
RPM_HASH = "bcc0fe3775c1c7bb5d1fdcee5f46a69645a69edd6de66c58ed74969ebf0369d20cb75eaa95333bb855652cc2c4b7aff4b7afa7f9a0c3c8a27e25d73ab88fd3fb"

RPROVIDES:${PN} += "tali"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
