SUMMARY = "Point-to-Point Tunneling Protocol (PPTP) Client"
DESCRIPTION = "A client for the proprietary Microsoft Point-to-Point Tunneling \
Protocol, PPTP.  It allows connections to a PPTP based VPN as used by \
employers and some cable and ADSL service providers. It requires MPPE \
support in the kernel. Use the ppp-mppe package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "pptp-1.10.0-4.10.aarch64.rpm"
RPM_HASH = "778b601ac1dfe5e92acb1057bbe71fa3cd337138034c7927ce8432cb0a47fadd789d4b8e235b6a4d8ff26a86f8fc5c1403bfbc48269b4f32c1476919f57c3da0"

RPROVIDES:${PN} += "config-pptp \
pptp"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
