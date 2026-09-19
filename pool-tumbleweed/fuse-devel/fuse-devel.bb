SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-devel-2.9.9-8.6.aarch64.rpm"
RPM_HASH = "581cca7e62e036d29848b5be9efa68b26b49f8468f207070adfe788f6d0d1797b4d976af049406a7824262755a1954e76857351b64f057eb22693609357c0699"

RPROVIDES:${PN} += "fuse-devel \
pkgconfig-fuse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse \
glibc-devel \
libfuse2 \
libulockmgr1"

inherit rpm
