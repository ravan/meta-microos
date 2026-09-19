SUMMARY = "Clone of the nifty little Macintosh game"
DESCRIPTION = "GALAXIS for UNIX \
 \
Lifeboats from a crippled interstellar liner are adrift in a starfield. \
To find them, you can place probes that look in all eight compass \
directions and tell you how many lifeboats they see. If you drop a probe \
directly on a lifeboat it will be revealed immediately. Your objective: \
find the lifeboats as quickly as possible, before the stranded passengers \
run out of oxygen! \
 \
This is a UNIX-hosted, curses-based clone of the nifty little Macintosh \
freeware game Galaxis. It doesn't have the super-simple, point-and-click \
interface of the original, but compensates by automating away some of \
the game's simpler deductions."
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "galaxis-1.11-1.11.aarch64.rpm"
RPM_HASH = "ce2cac55de899dc45d181a49ec6a4d068185e49c2d986f3314cbac6eed59f76523b5ea8a902dd9ee8b5793328a7f4e367e2aa6dfbd1b9ac6e4be66c862276b42"

RPROVIDES:${PN} += "galaxis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
