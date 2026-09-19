SUMMARY = "Frontend to Manage Connections to Remote Filesystems"
DESCRIPTION = "Gigolo is a frontend to manage connections to remote filesystems using \
GIO/GVFS. It allows connecting/mounting remote filesystems and manage"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "gigolo-0.6.0-1.6.aarch64.rpm"
RPM_HASH = "356386e70dee3b86ce2b258a9f8851682bfe5119fb9c671b32970966303cbf1cd0575104bda10376c912085fb2f769852b485db072cc2294b52117fcdb226e11"

RPROVIDES:${PN} += "gigolo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
xdg-utils"

inherit rpm
