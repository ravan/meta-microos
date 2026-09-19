SUMMARY = "Development files for libusrp"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libusrp."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.11"

RPM_NAME = "libusrp-devel-3.4.11-1.4.aarch64.rpm"
RPM_HASH = "8907ac2b28379cc0cd6a0d1ae97df874dec58444e04727ca3c09eb994a66f4e68274463af46d2f52668a6519941474b309913dfd5b9b549d506b776d6b848da7"

RPROVIDES:${PN} += "libusrp-devel \
pkgconfig-usrp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusrp1 \
pkgconfig-libusb-1.0"

inherit rpm
