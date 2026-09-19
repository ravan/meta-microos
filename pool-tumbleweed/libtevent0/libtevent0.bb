SUMMARY = "Samba tevent Library"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
This package contains the tevent0 library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.17.1"

RPM_NAME = "libtevent0-0.17.1-1.5.aarch64.rpm"
RPM_HASH = "f0f864a8dc5ba1bce8033d5c0b62d1d0991f3f4755b6bb0040273a9216fc3549b8d422f79e7e0fb8bc18699a09de11069414f93f56121283eee6f60c15bb3c58"

RPROVIDES:${PN} += "libtevent.so.0 \
libtevent0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2"

inherit rpm
