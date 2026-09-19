SUMMARY = "Udev rules for Linux Kernel PPS"
DESCRIPTION = "Udev rules for Linux Kernel PPS."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3+git20240314"

RPM_NAME = "pps-udev-1.0.3+git20240314-1.8.aarch64.rpm"
RPM_HASH = "0858e093173d48b454e7084c6c745e76c3b8ebb867c877dd17f2ce6ae873166b4bb215c5558ad6c31cf588b390de0589b2e301e09345717d0c79f1d2f55b50de"

RPROVIDES:${PN} += "pps-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
user-ntp"

inherit rpm
