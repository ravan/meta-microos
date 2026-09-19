SUMMARY = "Library to handle pty/tty and utmp/wtmp/lastlog"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty0-2.0-2.18.aarch64.rpm"
RPM_HASH = "9e8f2eb9e1a4d81ada94a4cde5991cd3c0272e06e1fbd01bdc85ceac770a8cd559dff36bbf3de4f645a47cde8b375d8fdf4c6120cf8345f33f1ab7c3f2944947"

RPROVIDES:${PN} += "libptytty.so.0 \
libptytty0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
