SUMMARY = "Network filter configuration files for the nwfilter daemon"
DESCRIPTION = "Network filter configuration files for cleaning guest traffic"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-config-nwfilter-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "8891b27df08db23124c502755fbe7650430c41d3254d834b7f7cbefcd861d2f3c81643743824fe9381226cc9a9d1f782ae3049838e261873472a7a7b58289abb"

RPROVIDES:${PN} += "config-libvirt-daemon-config-nwfilter \
libvirt-daemon-config-nwfilter"

RDEPENDS:${PN} += "libvirt-daemon-driver-nwfilter"

inherit rpm
