SUMMARY = "A utility for setting and manipulating filesystem quotas from the command line"
DESCRIPTION = "quotatool is a utility for setting and manipulating filesystem quotas from the \
command line. It supports quota on Linux (versions 2.6, 2.4, and 2.2, with \
ext2, ext3, ReiserFS, and XFS), Solaris, and AIX."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "quotatool-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "0f9c2f08651ad288b337cb656730979d3b65d13b872af962cfee8f6c87820b11bc21d53000f264651e7e5cbb232a28bc4cdd76ef566caa8f00a5b18518c1a8c1"

RPROVIDES:${PN} += "quotatool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
