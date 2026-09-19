SUMMARY = "A minimalist fan control program"
DESCRIPTION = "A simple fan control program. Read temperatures, check them against configured \
limits and switch to appropriate (also pre-configured) fan level. \
Requires a working thinkpad_acpi or any other hwmon driver \
that enables temperature reading and fan control from userspace. \
 \
Don't forget to set the desired temperature values in /etc/thinkfan.conf"
LICENSE = "GPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "thinkfan-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "8497a5977bc2f111ca9594ba0725415454b0f4d11989099feff3ebf7bdafc92b63587c5535f6732c4013a05f42d4462d34a44fb7cfdb0f6c9b7c771231f00d82"

RPROVIDES:${PN} += "config-thinkfan \
thinkfan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libsensors.so.4 \
libstdc++.so.6 \
libyaml-cpp.so.0.9"

inherit rpm
