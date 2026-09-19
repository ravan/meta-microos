SUMMARY = "Utilities for managing processes on your system"
DESCRIPTION = "The psmisc package contains utilities for managing processes on your \
system: pstree, killall and fuser.  The pstree command displays a tree \
structure of all of the running processes on your system.  The killall \
command sends a specified signal (SIGTERM if nothing is specified) to \
processes identified by name.  The fuser command identifies the PIDs of \
processes that are using specified files or filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "23.7"

RPM_NAME = "psmisc-23.7-5.5.aarch64.rpm"
RPM_HASH = "15afbb3ebb5fd20d6536c3bbaa9e52907c7e3742bb3478e7b4025ad9eaa0077a618eb553889f3cc58d023d3af46ec5697be40f47262e684fe354e53d68fcfd94"

RPROVIDES:${PN} += "/usr/bin/fuser \
ps-/usr/bin/killall \
psmisc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
