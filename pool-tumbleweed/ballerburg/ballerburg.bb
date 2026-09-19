SUMMARY = "Two players, two castles, and a hill in between"
DESCRIPTION = "Ballerburg is a castle combat game. Two players (which can be human or \
computer-controlled) try to destroy the opponent's castle with their cannons. \
 \
Eckhard Kruse's original Ballerburg from 1987 ported to SDL."
LICENSE = "GPL-3.0-only"

PV = "1.2.3"

RPM_NAME = "ballerburg-1.2.3-1.6.aarch64.rpm"
RPM_HASH = "50c58cf89fd3145b9cb0869c682c075a3e30abd3361df66799c82d105cd0175300456f40d3e84e383f545f1fa11c7fb47d797fff4caf0fe868a40ca511c9c2a6"

RPROVIDES:${PN} += "ballerburg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
