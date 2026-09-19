SUMMARY = "Keymap library for kbd utilities"
DESCRIPTION = "libkeymap contains routines for exchanging keyboard mappings \
with the Linux kernel for the Linux virtual console (vtcon)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.10.0"

RPM_NAME = "libkeymap1-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "4e66cb4f0d120ae211dcf6a78da6dc64afc5a8cc21327ae5711d2cecadc286f92b6f1de1f37b3413c51a8aed094dd65f922eac2b6128296f52d38466578f2c15"

RPROVIDES:${PN} += "libkeymap.so.1 \
libkeymap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkbdfile.so.1"

inherit rpm
