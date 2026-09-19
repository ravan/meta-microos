SUMMARY = "Software and/or Hardware watchdog daemon"
DESCRIPTION = "The watchdog program can be used as a powerful software watchdog daemon \
or may be alternately used with a hardware watchdog device such as the \
IPMI hardware watchdog driver interface to a resident Baseboard \
Management Controller (BMC).  watchdog periodically writes to /dev/watchdog; \
the interval between writes to /dev/watchdog is configurable through settings \
in the watchdog sysconfig file.  This configuration file is also used to \
set the watchdog to be used as a hardware watchdog instead of its default \
software watchdog operation.  In either case, if the device is open but not \
written to within the configured time period, the watchdog timer expiration \
will trigger a machine reboot. When operating as a software watchdog, the \
ability to reboot will depend on the state of the machine and interrupts. \
When operating as a hardware watchdog, the machine will experience a hard \
reset (or whatever action was configured to be taken upon watchdog timer \
expiration) initiated by the BMC."
LICENSE = "GPL-2.0-only"

PV = "5.16"

RPM_NAME = "watchdog-5.16-1.9.aarch64.rpm"
RPM_HASH = "0f99a6a0fb645bc132fe749f52c7bd7071af62a78c9b55af387605da08ffe4aa264c1c1271e8f31f47071548889bf7beb9295c734463aa54e75bd40ebc2d6913"

RPROVIDES:${PN} += "config-watchdog \
watchdog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
