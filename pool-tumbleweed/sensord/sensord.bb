SUMMARY = "Hardware health monitoring daemon"
DESCRIPTION = "sensord is a daemon that can be used to periodically log sensor \
readings from hardware health-monitoring chips to the system logs or a \
round-robin database (RRD) and to alert when a sensor alarm is \
signalled; for example, if a fan fails, a temperature limit is \
exceeded, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.2"

RPM_NAME = "sensord-3.6.2-5.4.aarch64.rpm"
RPM_HASH = "543b8f544d02af0a851aaa40e7c1eb972c27fc524dd8c2afa1b1fa067318d859a22b0192c7953e6d1c62546dfd86af73d86738d95de2482cb029e29f3bd4e948"

RPROVIDES:${PN} += "sensord \
sensors-/usr/sbin/sensord"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
libsensors.so.4"

inherit rpm
