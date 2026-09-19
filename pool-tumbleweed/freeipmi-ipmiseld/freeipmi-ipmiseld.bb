SUMMARY = "Polls system event logs (SEL)"
DESCRIPTION = "The daemon  polls  the system event log (SEL) of specified hosts and stores the \
logs into the local syslog. By default, the daemon can also make best efforts \
to manage the remote SEL buffer to ensure events are never lost. \
Recent logging data will be cached to disk to ensure that SEL events are \
not missed in the event the client or server is rebooted."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "freeipmi-ipmiseld-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "587856ad9d942a9e5836bd05f1447adf3f9bee2a908dc2424a6c744bddd19a240f0ddefa1b16b81b6f80fca5b19207529e3c9c8117818a679be3f360e31a762a"

RPROVIDES:${PN} += "config-freeipmi-ipmiseld \
freeipmi-/usr/sbin/ipmiseld \
freeipmi-ipmiseld"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
systemd"

inherit rpm
