SUMMARY = "GNU partitioner"
DESCRIPTION = "GNU Parted is a program for creating, destroying, resizing, checking, \
and copying partitions, and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.7"

RPM_NAME = "parted-3.7-1.3.aarch64.rpm"
RPM_HASH = "e41a6b5b01d5a96981bb153a510701a627db3fee82dfadf584fa9818d3fb407d9d6cb8fe15bc415ad1b02edb5a9ca297124e09700c900265d918fd95988612e0"

RPROVIDES:${PN} += "parted"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libparted-fs-resize.so.0 \
libparted.so.2 \
libreadline.so.8 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
