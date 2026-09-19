SUMMARY = "The Reliable, High Performance TCP/HTTP Load Balancer"
DESCRIPTION = "HAProxy implements an event-driven, mono-process model which enables support \
for very high number of simultaneous connections at very high speeds. \
Multi-process or multi-threaded models can rarely cope with thousands of \
connections because of memory limits, system scheduler limits, and lock \
contention everywhere. Event-driven models do not have these problems because \
implementing all the tasks in user-space allows a finer resource and time \
management. The down side is that those programs generally don't scale well on \
multi-processor systems. That's the reason why they must be optimized to get \
the most work done from every CPU cycle."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.4.4+git0.7f03ae65c"

RPM_NAME = "haproxy-3.4.4+git0.7f03ae65c-1.1.aarch64.rpm"
RPM_HASH = "c0ede2f7fd58d386bc2ef438e5ca988cc6e12b89dd63936d7a272964821e249a7172445b24484ebfe0f6850048656b069a9a72059291f5009254c271278371ca"

RPROVIDES:${PN} += "config-haproxy \
group-haproxy \
haproxy \
haproxy-1.5 \
haproxy-doc \
user-haproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
liblua5.4.so.5 \
libpcre2-8.so.0 \
libssl.so.3 \
libz.so.1 \
sysuser-shadow"

inherit rpm
