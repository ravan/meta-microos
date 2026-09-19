SUMMARY = "A web frontend for git repositories"
DESCRIPTION = "A web interface for the Git SCM, using a built-in cache to decrease server \
I/O pressure."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "cgit-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "14b932a72ae0fd239559eb830a4a4ea13e3d06e091baba08be49b3d6457b30671edb04dd2c76e412ebc0e96f856c3ba080a6c0af536b2b768ae8046656465a3d"

RPROVIDES:${PN} += "bundled-git \
cgit \
config-cgit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
group-www \
libc.so.6 \
libz.so.1 \
user-wwwrun"

inherit rpm
