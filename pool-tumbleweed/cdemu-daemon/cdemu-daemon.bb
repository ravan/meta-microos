SUMMARY = "Device daemon for cdemu, a virtual CD-ROM device emulator"
DESCRIPTION = "cdemu-daemon receives SCSI commands from kernel module thorugh the \
VHBA module and processes them, passing the requested data back to \
the kernel. The daemon implements the actual virtual device; one \
instance per each device registered by kernel module. It uses \
libmirage for the image access (e.g. sector reading). \
 \
The daemon registers itself on D-BUS's system or session bus \
(depending on the options passed to it) where it exposes an interface \
that can be used by clients to control it."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.1"

RPM_NAME = "cdemu-daemon-3.3.1-1.5.aarch64.rpm"
RPM_HASH = "d1f6db27c61d0d0ce519bb285c4e224a5254ac0cf8b0565f54889ea9fb87808e4ed31efe8fd95e1637aaf18d1f6a111872ddfa64bb5d012403a153dd8d64656b"

RPROVIDES:${PN} += "cdemu-daemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmirage.so.12 \
vhba-kmp"

inherit rpm
