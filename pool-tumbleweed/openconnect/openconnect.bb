SUMMARY = "Client for Cisco AnyConnect VPN"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, such as: \
 \
* Cisco's 'AnyConnect' VPN (HTTPS/DTLS) supported by the ASA5500 Series, \
  by IOS 12.4(9)T or later on Cisco SR500, 870, 880, 1800, 2800, 3800, \
  7200 Series and Cisco 7301 Routers, and probably others. \
* Array Networks AG SSL VPN \
* Juniper SSL VPN \
* Pulse Connect Secure \
* Palo Alto Networks GlobalProtect SSL VPN \
* F5 Big-IP SSL VPN \
* Fortinet Fortigate SSL VPN"
LICENSE = "LGPL-2.1-or-later"

PV = "9.21"

RPM_NAME = "openconnect-9.21-1.3.aarch64.rpm"
RPM_HASH = "8dede68a2908302c57cbac51b13d0edd5c633b44ecfd35f576001b8fb3c5e9defe97388e847a6e2b788b725120fc23055a60731f9992996f11054ecf23db7f73"

RPROVIDES:${PN} += "config-openconnect \
openconnect"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libopenconnect.so.5 \
libproxy.so.1 \
libxml2.so.16"

inherit rpm
