SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb-devel-2.2.7-113.3.aarch64.rpm"
RPM_HASH = "ecf6d7bb12505a5c56f746d2bc7e87b5607583d22b8b52af6901694f8e701578342e8a0882b3aa6eb65db2da5fbfbc85d109b8520ee11c496c9db2bc4dfdb61a"

RPROVIDES:${PN} += "libnjb-devel \
pkgconfig-libnjb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnjb \
libusb-devel"

inherit rpm
