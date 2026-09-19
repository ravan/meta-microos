SUMMARY = "Development package for the device mapper"
DESCRIPTION = "Files needed for software development using the device mapper"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38_1.02.212"

RPM_NAME = "device-mapper-devel-2.03.38_1.02.212-2.5.aarch64.rpm"
RPM_HASH = "e01fce35c874f03d29e1ab1beb9f3b01cb71e87e0c8617cb0c950a11aed9beae4f15cd48af24e9d8f72fc6de9f63f5758c855e074c3c631630b3f99aa2374022"

RPROVIDES:${PN} += "device-mapper-devel \
pkgconfig-devmapper \
pkgconfig-devmapper-event"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
device-mapper \
libdevmapper-event1-03 \
libdevmapper1-03 \
pkgconfig-libselinux \
pkgconfig-libudev"

inherit rpm
