SUMMARY = "Linux-native io_uring I/O access library"
DESCRIPTION = "Provides native async IO for the Linux kernel, in a fast and efficient \
manner, for both buffered and O_DIRECT."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.15"

RPM_NAME = "liburing2-2.15-1.1.aarch64.rpm"
RPM_HASH = "1fb7632c6074d88596a56a711c0f7cafe2493780c42549c7679361844dd34d35c0edd0ce5ce4d35bee24475661eb36951a077ee615b6ef7cfc43a1c68c818305"

RPROVIDES:${PN} += "liburing.so.2 \
liburing2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
