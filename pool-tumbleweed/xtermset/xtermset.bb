SUMMARY = "A program to change the settings of an xterm"
DESCRIPTION = "Xtermset allows you to change the characteristics of an xterm window \
from the command line. Most options have the same names as those that \
you would give an xterm at startup."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.5.2"

RPM_NAME = "xtermset-0.5.2-286.3.aarch64.rpm"
RPM_HASH = "18253bf4a1c9b73622daf8165f3fa428a05c0dbff80d7ee45cda271d5fec1a486390377f23da42ab6ea0b78fd9be403d931b6caf38007d348e7ee1bc9bc81085"

RPROVIDES:${PN} += "xtermset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
