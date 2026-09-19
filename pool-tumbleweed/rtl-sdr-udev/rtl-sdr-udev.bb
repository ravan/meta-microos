SUMMARY = "Udev rules for RTL2832"
DESCRIPTION = "Udev rules for rtl-sdr driver"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "rtl-sdr-udev-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "b6ce1084f48354b3dcfdbc6dee3fbfb7e980a4c53e6942f7e7d5efbe86e036daad60a656f462c668157942da678c3e2cd6fdc0d5040f72d25cf02289fa000c74"

RPROVIDES:${PN} += "rtl-sdr-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
