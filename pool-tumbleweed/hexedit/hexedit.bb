SUMMARY = "Hexadecimal editor for binary files"
DESCRIPTION = "Terminal binary file editor - edit and search hexadecimal and text. \
For the times when hexdump shows something you did not want to see."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "hexedit-1.6-1.14.aarch64.rpm"
RPM_HASH = "e9f3402118c0d3b258bbef068302f0df6ed10fadc3d172a51e523ec2b71a23b24a6ad78e72790b7d70b6a3dc6e45332ada4581bd4fa038a067ae956676bb2897"

RPROVIDES:${PN} += "hexedit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
