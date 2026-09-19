SUMMARY = "Tools for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package includes support tools for libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-tools-0.8.3-16.5.aarch64.rpm"
RPM_HASH = "755395550344b519ee2baf6d1de877a27e7305f9e11dcf1b3c1b48f6e487052aa1f6ffd6c505e6fecd6090e0e404c3ab05a9c435f19f6bd9c4f113f93b3d9767"

RPROVIDES:${PN} += "libgpod-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libsgutils2-1.48.so.2 \
libusb-1.0.so.0 \
libxml2.so.16"

inherit rpm
