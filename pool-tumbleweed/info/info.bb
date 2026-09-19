SUMMARY = "A Stand-Alone Terminal-Based Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "info-7.3-1.5.aarch64.rpm"
RPM_HASH = "3e0e5249fdb16096756a7288f37f2d4af6d59a9bec2892001cf89f22bcbdbfe8d92462ebcf130fab9288226ebcd310c2833b82dc5d0a2c2f88efe3de02d2db3e"

RPROVIDES:${PN} += "/sbin/install-info \
info"

RDEPENDS:${PN} += "/usr/bin/gunzip \
/usr/bin/gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
libzio.so.1"

inherit rpm
