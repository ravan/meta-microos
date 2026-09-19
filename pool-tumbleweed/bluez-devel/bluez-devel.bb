SUMMARY = "Files needed for BlueZ development"
DESCRIPTION = "Files needed to develop applications for the BlueZ Bluetooth protocol \
stack."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-devel-5.82-2.4.aarch64.rpm"
RPM_HASH = "93fcfe078aedb7e2248c6a29c961c6bf7cfb97e539bf854679f96927802f12e7acafd03a538995b63c8560ece71186f8682b5bfba521e3f9499862a959db5e02"

RPROVIDES:${PN} += "bluez-devel \
pkgconfig-bluez"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluetooth3"

inherit rpm
