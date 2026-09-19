SUMMARY = "PoPToP - PPTP Daemon, Linux as Microsoft VPN Server"
DESCRIPTION = "PoPToP is a PPTP(Point-to-Point Tunneling Protocol) server solution for \
Linux, it allows Linux servers to function seamlessly in the PPTP VPN \
environment. This release supports Windows 95/98/NT/2000 PPTP clients \
and PPTP Linux clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "pptpd-1.4.0-5.10.aarch64.rpm"
RPM_HASH = "47c5ce6f64e355e568437c54ab69fbd1837282710c9906d6a32e5c06fe7510f50508cb773afc1ee5ed9f22520c26b40934ac8dde991e747afb0d695121567ee2"

RPROVIDES:${PN} += "config-pptpd \
pptpd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
ppp"

inherit rpm
