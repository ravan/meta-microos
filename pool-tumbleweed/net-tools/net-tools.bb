SUMMARY = "Important Programs for Networking"
DESCRIPTION = "This package contains programs for network administration and maintenance. \
Most of the utilities formerly contained in this package (netstat, arp, \
ifconfig, rarp, route, ether-wake) are obsoleted by the tools from iproute2 \
package (ip, ss) and have been moved to net-tools-deprecated."
LICENSE = "GPL-2.0-or-later"

PV = "3.14~alpha~git.20260718.4f5bfb2"

RPM_NAME = "net-tools-3.14~alpha~git.20260718.4f5bfb2-1.1.aarch64.rpm"
RPM_HASH = "08ceb2f3b8045f31436bde6178e1b10601776f665278f3d43e18eb0eff030d5e2143ad946894d95d03f3153901cc606f7442ea7a4591cc6832b429024c756abb"

RPROVIDES:${PN} += "net-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
