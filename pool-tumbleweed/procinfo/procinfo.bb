SUMMARY = "Tool to Display System Status Gathered from /proc"
DESCRIPTION = "The 'procinfo' command gathers some system data from the /proc \
directory and prints it nicely formatted on the standard output device."
LICENSE = "GPL-2.0-or-later"

PV = "18"

RPM_NAME = "procinfo-18-226.9.aarch64.rpm"
RPM_HASH = "57b0228e4ef3dd17127b9c4fedef96110a7db3100431aba933853371793cdbcdaf78034e0d6dc6e5bf58c56f243c7d3722d59b2aff55266354e86d4267aed7c6"

RPROVIDES:${PN} += "procinfo \
ps-/usr/bin/lsdev"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
