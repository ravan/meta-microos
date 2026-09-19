SUMMARY = "Development libraries and header files for hidapi"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the hidapi library."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "libhidapi-devel-0.14.0-1.11.aarch64.rpm"
RPM_HASH = "2bbeda29843f3ca55803f246282d5ce615c79a1222fabe0eab9253587461dc3a34d0c38a00456f8c3cd679752081679b9e1a7590914bff26b02058eeb99d888c"

RPROVIDES:${PN} += "libhidapi-devel \
pkgconfig-hidapi-hidraw \
pkgconfig-hidapi-libusb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libhidapi-hidraw0 \
libhidapi-libusb0 \
libudev-devel \
libusb-1-0-devel"

inherit rpm
