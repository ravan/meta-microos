SUMMARY = "Hardware health monitoring for Linux"
DESCRIPTION = "This package includes programs that show data from some sensor chips. \
The interface /proc/bus/i2c/ is provided by loading kernel modules. \
Which modules to load can be interactively detected as root by calling \
/usr/sbin/sensors-detect. Warning, before using the sensors the default \
configuration in /etc/sensors.conf has to be checked and changed to fit \
the actual set up of the mainboard and the BIOS used on that specific \
mainboard!"
LICENSE = "GPL-2.0-or-later"

PV = "3.6.2"

RPM_NAME = "sensors-3.6.2-5.4.aarch64.rpm"
RPM_HASH = "7a9e47920d70ec7e7d4dcf04c2af633fcce3200e327834455251813c38b73318b49577fb6820a02b16ef0e91aa60af60a647146bb39913278cb21cf6027509b2"

RPROVIDES:${PN} += "sensors"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsensors.so.4 \
modutils \
systemd"

inherit rpm
