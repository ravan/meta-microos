SUMMARY = "Syslog-ng event logger library runtime"
DESCRIPTION = "The EventLog library provides an alternative to the simple syslog() \
API provided on UNIX systems. Compared to syslog, EventLog adds \
structured messages. \
 \
EventLog provides an interface to build, format and output an event \
record. The exact format and output method can be customized by the \
administrator via a configuration file. \
 \
This package is now merged into syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "libevtlog-4_12-0-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "dc4cce7da1e57436622713a79316b83793d37ed9402bd5ffb5ac7d8b6aaa62fb0c635e83c1e0d09b70c60cc09f849b515107a0f39b100527ed9dac01e86ea824"

RPROVIDES:${PN} += "libevtlog-4-12-0 \
libevtlog-4.12.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
