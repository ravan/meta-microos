SUMMARY = "Development files for hplip"
DESCRIPTION = "This package is only required by developers."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-devel-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "a9e92ccbe728ae7437c7a5d1097fcfa236cdb78627192ad478d76e068d917753f64890d6688f19f2589069cdaaef75f6a8972b5c58e2f9d9bcda3483c8109ae8"

RPROVIDES:${PN} += "hplip-devel"

RDEPENDS:${PN} += "cups-devel \
dbus-1-devel \
hplip-hpijs \
hplip-sane \
libopenssl-devel \
libusb-1-0-devel \
net-snmp-devel"

inherit rpm
