SUMMARY = "ISC DHCP Client"
DESCRIPTION = "This is an alternative DHCP client, the ISC DHCP client for Linux. Like \
'dhcpcd' (the client that is installed by default), it can be used to \
configure the network setup.  IP address, hostname, routing, \
nameserver, netmask, and broadcast can be dynamically assigned while \
booting the machine. \
 \
It is configurable via the configuration file /etc/dhclient.conf and \
you can define your own 'hooks' to be used by the /sbin/dhclient-script \
(which is called by the daemon)."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-client-4.4.3.P1-1.2.aarch64.rpm"
RPM_HASH = "dfc7d9f4e8a5414be249213d74d75f5b0d8bc58af73ef26c2b4b0f74ef20e0b1bb032b9b935d7aea1ecb9f058c795a29685d8294b36ca520a7ccb45941fd49a3"

RPROVIDES:${PN} += "config-dhcp-client \
dhcp-client"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getent \
/usr/bin/hostname \
dhcp \
iproute2 \
iputils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
