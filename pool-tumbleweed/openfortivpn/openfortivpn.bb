SUMMARY = "Client for PPP+SSL VPN tunnel services"
DESCRIPTION = "openfortivpn is a client for PPP+SSL VPN tunnel services. It spawns a pppd \
process and operates the communication between the gateway and this process. \
 \
It is compatible with Fortinet VPNs."
LICENSE = "GPL-3.0-or-later"

PV = "1.24.1"

RPM_NAME = "openfortivpn-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "10fd74e9d9a40680676b86589729bc6f805627b2e7ec55a921e60c4e006459997d48883795ca1972bff120d96a03fbdb56f5f12e2806a0398d6d4faae90554ee"

RPROVIDES:${PN} += "config-openfortivpn \
openfortivpn"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
ppp"

inherit rpm
