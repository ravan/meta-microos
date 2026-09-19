SUMMARY = "The USB/IP shared USB system over IP network"
DESCRIPTION = "This package contains headers and static libraries for USB/IP \
development"
LICENSE = "GPL-2.0-or-later"

PV = "7.2.5"

RPM_NAME = "usbip-devel-7.2.5-1.39.aarch64.rpm"
RPM_HASH = "fdd338ae2ffd65420c2782684788fae390339dee5695426021336b3a755abce89593e3a8dc1fd4a08123cbbe59fd46e0f23fe8167b759ca47c73ec0b26fa3362"

RPROVIDES:${PN} += "usbip-devel"

RDEPENDS:${PN} += "usbip"

inherit rpm
