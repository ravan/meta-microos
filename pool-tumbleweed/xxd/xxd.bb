SUMMARY = "A hex dump utility"
DESCRIPTION = "xxd creates a hex dump of a given file or standard input.  It can also convert \
a hex dump back to its original binary form."
LICENSE = "Vim"

PV = "9.2.0901"

RPM_NAME = "xxd-9.2.0901-1.1.aarch64.rpm"
RPM_HASH = "262638cdc92038ea039a44add77bed0a18411fcd5b81d235b2659f2ba7af572af5823132c990afa78108721ec5f4792d6560f6dad30381580f0ee8fd7f626c96"

RPROVIDES:${PN} += "xxd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
