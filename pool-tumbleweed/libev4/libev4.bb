SUMMARY = "An event loop library"
DESCRIPTION = "An event loop that is loosely modeled after libevent. Features \
include child/PID watchers, periodic timers based on wallclock \
(absolute) time (in addition to timers using relative timeouts), as \
well as epoll/kqueue/event ports/inotify/eventfd/signalfd support, \
timer management, time jump detection and correction. \
 \
This package holds the shared libraries of libev."
LICENSE = "BSD-2-Clause"

PV = "4.33"

RPM_NAME = "libev4-4.33-6.5.aarch64.rpm"
RPM_HASH = "a56dac68701ccaf1de66803ac948cef8e7aec091117f591d02a798500d9dc7a4a65eacf781695ac7217d39fe8ae480e810f658b43ce1ba3007b5b8e5039fcfb1"

RPROVIDES:${PN} += "libev.so.4 \
libev4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
