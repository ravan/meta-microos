SUMMARY = "Realtime Policy and Watchdog Daemon"
DESCRIPTION = "RealtimeKit is a D-Bus system service that changes the scheduling policy of \
user processes/threads to SCHED_RR (i.e. realtime scheduling mode) on \
request. It is intended to be used as a secure mechanism to allow real-time \
scheduling to be used by normal user processes."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.14"

RPM_NAME = "rtkit-0.14-1.4.aarch64.rpm"
RPM_HASH = "df67c12e77483a7cde745c049bb5bffac814a977f01bca4ee8c6025cbc4f7156fba428daccdead557688510b95b1de3a420d10b624b0b529fc68600a81c03653"

RPROVIDES:${PN} += "group-rtkit \
rtkit \
user-rtkit"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libsystemd.so.0 \
polkit \
sysuser-shadow"

inherit rpm
