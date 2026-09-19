SUMMARY = "The Syslog daemon"
DESCRIPTION = "The syslogd daemon is the general system logging daemon, which is \
responsible for handling requests for syslog services. \
 \
This version of syslogd is similar to the standard Berkeley product, \
but with a number of compatible extensions."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "syslogd-1.5.1-808.4.aarch64.rpm"
RPM_HASH = "08c902f9901c1969a8572bfc4085b7cf0121edfc0a1f12036f1f7cd9eed87e181c729359cb22644c2e5baf06727750b3bf10975228a78460ed042beb01361fa1"

RPROVIDES:${PN} += "config-syslogd \
sysklogd \
syslog \
syslogd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-news \
klogd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
permissions \
syslog-service \
systemd \
user-news"

inherit rpm
