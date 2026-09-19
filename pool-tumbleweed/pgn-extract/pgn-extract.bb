SUMMARY = "A CLI program for manipulating PGN files"
DESCRIPTION = "This is a command-line program for manipulating chess games recorded \
in the Portable Game Notation (PGN). \
Extracted games may be written out either including or excluding \
comments, NAGs, variations, move numbers, tags and/or results. \
Games may be given ECO classifications derived from the accompanying \
file /usr/share/pgn-extract/eco.pgn, or a customised version provided \
by the user. \
 \
For a full description of pgn-extract's functionality see \
/usr/share/doc/packages/pgn-extract/help.html."
LICENSE = "GPL-3.0-or-later"

PV = "26.04"

RPM_NAME = "pgn-extract-26.04-1.3.aarch64.rpm"
RPM_HASH = "f43b3c4d32928b8f736ad7dd02fdbf1280745991204933e5a8efabe4294c906ea8b71368ab30b490fce1e4d981f1d802d0de0c5ed71c111305eaf42b6eb60d69"

RPROVIDES:${PN} += "pgn-extract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
