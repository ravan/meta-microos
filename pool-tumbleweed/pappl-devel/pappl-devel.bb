SUMMARY = "Development files for PAPPL"
DESCRIPTION = "PAPPL is a C-based framework/library for developing CUPS Printer \
Applications, which are the recommended replacement for printer \
drivers. \
 \
This subpackage contains the headers for the library."
LICENSE = "Apache-2.0"

PV = "1.4.12"

RPM_NAME = "pappl-devel-1.4.12-1.1.aarch64.rpm"
RPM_HASH = "1125fec39c8b429e22454ba5abaf256da3ffd342f3fa31ac5c226de1ab4218464471a17228ce3dd70ba4f5d1daeab3adf760a5b6e4255b35c2ec9a1b9acc7262"

RPROVIDES:${PN} += "pappl-devel \
pkgconfig-pappl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpappl1 \
pkgconfig-avahi-client \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libusb-1.0 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
