SUMMARY = "Offline Browser Utility"
DESCRIPTION = "HTTrack is a free (GPL, libre/free software) and easy-to-use offline \
browser utility. \
 \
It allows you to download a World Wide Web site from the Internet to a \
local directory, building recursively all directories, getting HTML, \
images, and other files from the server to your computer. HTTrack \
arranges the original site's relative link-structure. Simply open a page \
of the 'mirrored' website in your browser, and you can browse the site \
from link to link, as if you were viewing it online. HTTrack can also \
update an existing mirrored site, and resume interrupted downloads. \
 \
HTTrack is fully configurable, and has an integrated help system."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "httrack-3.49.2-3.11.aarch64.rpm"
RPM_HASH = "bad2198c5617b8204ba200bab3a31739d1d08478d6a38920239f31b8f385d5fb6b89aa21ea2e1844fef5ebff41c85182b7ff5504bd39a3656847c0e4b087c795"

RPROVIDES:${PN} += "httrack"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhttrack.so.2 \
libz.so.1"

inherit rpm
