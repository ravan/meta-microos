SUMMARY = "A tiny library that exposes a event API on top of Linux futexes"
DESCRIPTION = "This is a tiny library that exposes a event API on top of Linux \
futexes. There was some discussion about using eventfd instead of this, \
but the cost of adding two FDs to the X server for every DRI application \
seems excessive, and by using PresentIdleNotify events, to work around \
the limitations of futexes."
LICENSE = "HPND"

PV = "1.3.3"

RPM_NAME = "libxshmfence1-1.3.3-1.7.aarch64.rpm"
RPM_HASH = "9c486a4b41f4809e4d26ff98466320cf25e728ffab3bde7e74c1774a2f61e58faf79b5a05b590751bc4c82aa38a242886d04f0dc502fe500b5c0c1fb86a04b1f"

RPROVIDES:${PN} += "libxshmfence.so.1 \
libxshmfence1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
