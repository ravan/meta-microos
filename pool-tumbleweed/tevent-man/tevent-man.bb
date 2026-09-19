SUMMARY = "An event system based on the talloc memory management library"
DESCRIPTION = "Tevent is an event system based on the talloc memory management library. It \
is the core event system used in Samba. \
 \
The low level tevent has support for many event types, including timers, \
signals, and the classic file descriptor events. \
 \
Tevent also provide helpers to deal with asynchronous code providing the \
tevent_req (tevent request) functions."
LICENSE = "LGPL-3.0-or-later"

PV = "0.17.1"

RPM_NAME = "tevent-man-0.17.1-1.3.aarch64.rpm"
RPM_HASH = "2f67555310a99fc1a4fc312b2c909b7af4d646135d2c22c8554be20b801048d6a814e9c522f3cbda7b9ee7839740c38859a1d14169a92a2bd2be3c0d0645ca63"

RPROVIDES:${PN} += "tevent-man"

RDEPENDS:${PN} += ""

inherit rpm
