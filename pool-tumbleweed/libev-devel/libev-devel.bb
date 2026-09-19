SUMMARY = "Development files for libev"
DESCRIPTION = "An event loop that is loosely modeled after libevent. Features \
include child/PID watchers, periodic timers based on wallclock \
(absolute) time (in addition to timers using relative timeouts), as \
well as epoll/kqueue/event ports/inotify/eventfd/signalfd support, \
timer management, time jump detection and correction. \
 \
It can be used as a libevent replacement using its emulation API, or \
directly embedded into programs. An optional Perl interface is \
available. \
 \
This package holds the development files for libev."
LICENSE = "BSD-2-Clause"

PV = "4.33"

RPM_NAME = "libev-devel-4.33-6.5.aarch64.rpm"
RPM_HASH = "58ac623af52bd84663aca296a8f8d0537928a175427147f87ccaefb50a2bf7aa3f601e665197bd5c5fa6878372761fe244b094db6ee4727c822eb35173045b26"

RPROVIDES:${PN} += "libev-devel \
pkgconfig-libev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libev4"

inherit rpm
