SUMMARY = "Faithful transcription of the 1974 Atari Wumpus game"
DESCRIPTION = "WUMPUS is a bit of retrocomputing nostalgia. It is an *exact* clone, \
even down to the godawful user interface, of an ancient classic game. \
This version fixes two minor bugs in my original 1992 USENET posting \
of the source. Superhack is a structurally similar game with a \
different premise."
LICENSE = "BSD-2-Clause"

PV = "1.9"

RPM_NAME = "wumpus-1.9-2.11.aarch64.rpm"
RPM_HASH = "5c5f1879de704213247458305c30668cccd07ad53efc3923474ee395a995002507d05093feab709614fb1c434b89070e32d5aa354100cd82f302d3bf0b9e8d4a"

RPROVIDES:${PN} += "wumpus"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
