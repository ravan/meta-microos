SUMMARY = "Development files for libevent2"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
This package holds the development files for libevent2."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-devel-2.1.12-5.7.aarch64.rpm"
RPM_HASH = "96b0f2b92cff416346ef74794389a8b7168d66f2be346720208cfd9dc3af3d5f9c4d4b0e93ef181a8b92a41b119099d104becb403859fdea27c4628b93df3245"

RPROVIDES:${PN} += "libevent-/usr/include/event.h \
libevent-devel \
pkgconfig-libevent \
pkgconfig-libevent-core \
pkgconfig-libevent-extra \
pkgconfig-libevent-openssl \
pkgconfig-libevent-pthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
glibc-devel \
libevent-2-1-7 \
pkgconfig-libevent"

inherit rpm
