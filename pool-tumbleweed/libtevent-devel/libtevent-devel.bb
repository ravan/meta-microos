SUMMARY = "Libraries and Header Files to Develop Programs with tevent0 Support"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
Tevent also provide helpers to deal with asynchronous code providing the \
tevent_req (tevent request) functions. \
 \
This package contains libraries and header files need for development."
LICENSE = "LGPL-3.0-or-later"

PV = "0.17.1"

RPM_NAME = "libtevent-devel-0.17.1-1.5.aarch64.rpm"
RPM_HASH = "9bbbb1b19be94f115c6c12e8b1f09d9c3ee8a6238cfc2a6751681bb23d9974449ef18f12bf1b2881e7971426970a2cfbbd87ca5ffe627ba69b6c40a22d8b5f18"

RPROVIDES:${PN} += "libtevent-devel \
pkgconfig-tevent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtalloc-devel \
libtevent0 \
pkg-config \
pkgconfig-talloc"

inherit rpm
