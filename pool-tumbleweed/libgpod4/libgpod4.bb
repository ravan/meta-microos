SUMMARY = "Library to Manipulate Songs and Playlists Stored on an iPod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod4-0.8.3-16.5.aarch64.rpm"
RPM_HASH = "22a2fbe020d7171236cb532ac742ef1d3c6964ef5e79e01d0d124f98929627887058585843ed6dba0400a1a5888c8dbdefa2caf945d1c462c19fba0a646fe48c"

RPROVIDES:${PN} += "libgpod \
libgpod.so.4 \
libgpod4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libsqlite3.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
