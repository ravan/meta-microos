SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap static libraries"
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "libpcap-devel-static-1.10.7-1.1.aarch64.rpm"
RPM_HASH = "dfaecd33fff52b7390d797513ced5840ed8d34f472b651e7601b085ef048d21dfc99c7f47818efbe839602ff2c71b026910ec78e17152f5b3406e4384eb7bce9"

RPROVIDES:${PN} += "libpcap-devel-static"

RDEPENDS:${PN} += "bluez-devel \
dbus-1-devel \
libnl3-devel \
libpcap-devel \
pkgconfig-libusb-1.0"

inherit rpm
