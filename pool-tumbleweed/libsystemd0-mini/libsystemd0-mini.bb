SUMMARY = "Component library for systemd"
DESCRIPTION = "This library provides several of the systemd C APIs: \
 \
* sd-bus implements an alternative D-Bus client library that is \
  relatively easy to use, very efficient and supports both classic \
  D-Bus as well as kdbus as transport backend. \
 \
* sd-daemon(3): for system services (daemons) to report their status \
  to systemd and to make easy use of socket-based activation logic \
 \
* sd-event is a generic event loop abstraction that is built around \
  Linux epoll, but adds features such as event prioritization or \
  efficient timer handling. \
 \
* sd-id128(3): generation and processing of 128-bit IDs \
 \
* sd-journal(3): API to submit and query journal log entries \
 \
* sd-login(3): APIs to introspect and monitor seat, login session and \
  user status information on the local system."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "libsystemd0-mini-261.2-1.1.aarch64.rpm"
RPM_HASH = "69cde8bf99f4eb6ac49b396c533a1ab99937dcb684ddce2e524c5ebe4eb89d92081a5baf0e4f558c3725d9e3ee772944ce4d0a9cdb304b3766c2a326e38e0d1e"

RPROVIDES:${PN} += "libsystemd.so.0 \
libsystemd0 \
libsystemd0-mini"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
this-is-only-for-build-envs"

inherit rpm
