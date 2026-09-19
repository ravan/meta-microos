SUMMARY = "Deprecated Networking Utilities"
DESCRIPTION = "This package contains the deprecated network utilities arp, ifconfig, \
netstat and route, which have been replaced by tools from the iproute2 \
package: \
  * arp -> ip [-r] neigh \
  * ether-wake -> wol \
    or use busybox-ether-wake \
  * ifconfig -> ip addr \
  * ipmaddr -> ip maddress \
  * iptunnel -> ip tunnel \
  * netstat -> ss [-r] \
  * route -> ip route"
LICENSE = "GPL-2.0-or-later"

PV = "3.14~alpha~git.20260718.4f5bfb2"

RPM_NAME = "net-tools-deprecated-3.14~alpha~git.20260718.4f5bfb2-1.1.aarch64.rpm"
RPM_HASH = "c39918b3cb777785062b543bb9cf88ba1d73ef34a59f2e38c3440630cc6d508f154c54b814dd23c7a24a3df4779087380160d2088518abb3f381210c1d96d9df"

RPROVIDES:${PN} += "net-tools-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
