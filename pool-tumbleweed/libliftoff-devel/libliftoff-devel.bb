SUMMARY = "Development files for libliftoff"
DESCRIPTION = "The libliftoff-devel package contains libraries and header files for \
developing applications that use libliftoff."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libliftoff-devel-0.5.0-1.9.aarch64.rpm"
RPM_HASH = "65ae891ed4cf99f5b5e9aaf21532e0dbecece5163431371739420ee050dea6defeefeb1d56f15ba7dc1d10b46585e9fbdf33ba8694fa1ecdc36645eb16e0b826"

RPROVIDES:${PN} += "libliftoff-devel \
pkgconfig-libliftoff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libliftoff0 \
pkgconfig-libdrm"

inherit rpm
