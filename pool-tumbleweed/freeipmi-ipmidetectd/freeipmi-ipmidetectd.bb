SUMMARY = "IPMI node detection monitoring daemon"
DESCRIPTION = "This service detects and monitors IPMI nodes."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "freeipmi-ipmidetectd-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "c650f1fdd45d7bf1492e6f04436523438fb98b2174ae806f6e10b9f65f7420da7fedcfafec7eeb383af949f96bb2476496209162b0a6e919711bb01581bd9925"

RPROVIDES:${PN} += "config-freeipmi-ipmidetectd \
freeipmi-ipmidetectd"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
systemd"

inherit rpm
