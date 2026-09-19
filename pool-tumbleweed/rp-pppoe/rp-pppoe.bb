SUMMARY = "A PPP Over Ethernet Redirector for PPPD"
DESCRIPTION = "rp-pppoe is a user-space redirector which permits the use of PPPoE \
(Point-to-Point Protocol Over Ethernet) with Linux. PPPoE is used by \
many ADSL service providers."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "rp-pppoe-4.0-4.8.aarch64.rpm"
RPM_HASH = "829637d33fc7100e86e75a0bc64ceea666ac2a8f22180b082b74a392ee98c5fe9dab68943b79f4cb906af1d6c14e9a71c9204e51f636d48d5ce38f24e2d12fd7"

RPROVIDES:${PN} += "config-rp-pppoe \
rp-pppoe"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
group-dialout \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
ppp"

inherit rpm
