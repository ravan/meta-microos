SUMMARY = "Event loop library"
DESCRIPTION = "libuEv is an event loop in the style of libevent, libev and the Xt(3) \
event loop. It has a small feature set. \
 \
libuEv is built on top of the Linux APIs epoll, timerfd and signalfd. \
Note however, a certain amount of care is needed when dealing with \
APIs that employ signalfd."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libuev3-2.4.1-2.11.aarch64.rpm"
RPM_HASH = "a4c6eaba45f44f7d1d412a153c18bf5da053cbb412c3ad9fed0ad2813780b03d400f4ae9f2823525d49e8bd0e33938ff0fb0f1896e56e8b14dfbea7569b2f76e"

RPROVIDES:${PN} += "libuev.so.3 \
libuev3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
