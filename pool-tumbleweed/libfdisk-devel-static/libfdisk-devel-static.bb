SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libfdisk-devel-static-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "0ca3a8b95f1bc58354870bb26e33ead4f45496acc2b8fd3dcc4f2396917730f42292a2f3469456027aaa9b47ed3894fd270a50966a78ece642f1b693cd3fb4b0"

RPROVIDES:${PN} += "libfdisk-devel-static"

RDEPENDS:${PN} += "libblkid-devel-static \
libeconf-devel \
libfdisk-devel \
libuuid-devel-static"

inherit rpm
