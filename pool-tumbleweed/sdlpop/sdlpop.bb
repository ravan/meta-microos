SUMMARY = "An open-source port of Prince of Persia"
DESCRIPTION = "SDLPoP is an open-source port of Prince of Persia 1, \
that runs natively under Linux. It is based on the DOS \
version of the game, and uses SDL. \
 \
Run the prince executable in a path were the original \
game data files are located."
LICENSE = "GPL-3.0-only"

PV = "1.23"

RPM_NAME = "sdlpop-1.23-5.11.aarch64.rpm"
RPM_HASH = "1aa68ba7a03a47914eae342e0d3d7bfae3d81b7941c78586588c0ceb475f7304687c80000879888ca6d86636137bac073fdd0f25e60b607ee0e6dca8e0ba8b1f"

RPROVIDES:${PN} += "sdlpop"

RDEPENDS:${PN} += "/usr/bin/sh \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
