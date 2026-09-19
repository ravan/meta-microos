SUMMARY = "UPS monitoring daemon"
DESCRIPTION = "powerd monitors the serial port connected to an UPS device and will perform \
an unattended shutdown of the system if the UPS is on battery longer \
than a specified number of minutes."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "powerd-2.0.2-4.4.aarch64.rpm"
RPM_HASH = "7489db3ae4b993b1a21f6e249f84b0e300b854d313f463bac03ad75db9f46ccc2b65483d23c58dffc50a97011e02dd11591e95d518b61ad926d486a027e94a49"

RPROVIDES:${PN} += "config-powerd \
powerd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
