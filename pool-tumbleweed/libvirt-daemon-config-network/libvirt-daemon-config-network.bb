SUMMARY = "Default configuration files for the network daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-config-network-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "2344da268d4d8460b5f947c8fa899dc62c4b86b02beb21a2b9a92787fa22fca29f7ceeea8fdea77d3b0b19f04fc0f96e43ee8eb8574148b04192ad058712617a"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
