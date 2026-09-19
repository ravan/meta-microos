SUMMARY = "Tools to create, extract, modify, and mount WIM files"
DESCRIPTION = "Tools to create, extract, modify, and mount files in the Windows Imaging Format \
(WIM files).  These files are normally created by using the `imagex.exe' utility \
on Windows, but this package contains an implementation of ImageX called \
'wimlib-imagex'."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.14.4"

RPM_NAME = "wimtools-1.14.4-1.13.aarch64.rpm"
RPM_HASH = "a1301d2973f15789c272e6dea29253c96edcd9354066fa487e21ae3876aae63ab3fa6f330b260314bd5649ad0af1e001001ccf6d82b1bdec885cf54f7022439f"

RPROVIDES:${PN} += "wimtools"

RDEPENDS:${PN} += "/usr/bin/bash \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwim.so.15"

inherit rpm
