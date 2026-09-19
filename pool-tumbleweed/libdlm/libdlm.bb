SUMMARY = "Application interface to the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libdlm-4.3.0-2.5.aarch64.rpm"
RPM_HASH = "ea9981e9ed8c2776bd2c0ed140b849ca019a0a7f2ae8d1702c711adc9c9b9c829ae77159d4641370deeef596af85411154adca19eaf8459948feb868bf80b763"

RPROVIDES:${PN} += "libdlm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.7 \
libcmap.so.4 \
libcpg.so.4 \
libdlm.so.3 \
libdlmcontrol.so.3 \
libquorum.so.5 \
libuuid.so.1"

inherit rpm
