SUMMARY = "Documentation for the libgtop library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.41.3+4"

RPM_NAME = "libgtop-doc-2.41.3+4-3.3.noarch.rpm"
RPM_HASH = "ba3e784e78fbd2703ec444bd7f04573b58e3486bff469068d6cf548a4d5ebdcf078a5254af78f1904077b51ac7d2a4639e7948351941ffb27443d3e4c3646a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgtop-doc"

RDEPENDS:${PN} += "/sbin/install-info \
/usr/bin/sh \
libgtop-2-0-11"

inherit rpm
