SUMMARY = "Utility to dump an image of an X window"
DESCRIPTION = "Xwd is an X Window System window dumping utility. It allows X users to \
store window images in a specially formatted dump file. This file can \
then be read by various other X utilities for redisplay, printing, \
editing, formatting, archiving, image processing, etc."
LICENSE = "MIT"

PV = "1.0.10"

RPM_NAME = "xwd-1.0.10-1.2.aarch64.rpm"
RPM_HASH = "ab8b860c637c178162702ee8f8df155188e39c8630f7f7eed17f2061a5f788405f52c809615c1844c8052d9a4dce2bcb60de4fdb4dc729e62323715bf871cb17"

RPROVIDES:${PN} += "xwd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
