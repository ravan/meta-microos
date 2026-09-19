SUMMARY = "ISO 9660 Rock Ridge Filesystem Manipulator"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
Vice versa xorriso is able to restore file objects from ISO 9660 filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "xorriso-1.5.8-1.2.aarch64.rpm"
RPM_HASH = "eb85e193b3053c6e48971f97a4406b9904301f57767a72c155c4b25db565a2f4b775a8b88ddf59d2b1d4382bca8cc65852f5f1928765814daea25d6f3649aafa"

RPROVIDES:${PN} += "libburnia-tools \
libburnia-tools-x11 \
xorriso"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libisoburn.so.1"

inherit rpm
