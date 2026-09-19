SUMMARY = "File system directory change monitoring tool"
DESCRIPTION = "GNU Direvent monitors events in the file system directories. For each event \
that occurs in a set of pre-configured directories, the program calls an \
external program associated with it, supplying it with the information about \
the event and the location within the file system where it occured."
LICENSE = "GPL-3.0-or-later"

PV = "5.5"

RPM_NAME = "direvent-5.5-1.3.aarch64.rpm"
RPM_HASH = "83864d373d63aea14a0c7376e23903c7cf6a9e907acf7949e6d824dd4c6caa3644e45c2010c0abbeaaceb2cb33928faf2979b3058fceead339e6ed8741f6abde"

RPROVIDES:${PN} += "direvent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
