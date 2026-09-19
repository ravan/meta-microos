SUMMARY = "Old-style 'ipsec' interface (stroke/starter) for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides an ipsec(8) command-line interface and \
configuration mechanism (/etc/ipsec.conf, ipsec.secrets). \
 \
Old-style ipsec(8) management of strongSwan is deprecated since \
version 5.2.0."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-ipsec-6.1.0-1.1.aarch64.rpm"
RPM_HASH = "f3299f5087a1901b5d98b0e8eae3407c65e3b81d3374657fe581ce97204e2add0139f5e2acfe0faa19cae129a0fabcb2be06b6dcbf59a713b9a8f0a9825c4224"

RPROVIDES:${PN} += "VPN \
config-strongswan-ipsec \
ipsec \
libstrongswan-stroke.so \
strongswan-ipsec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstrongswan.so.0 \
strongswan"

inherit rpm
