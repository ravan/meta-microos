SUMMARY = "Development files for access to MTP Player library"
DESCRIPTION = "This package contains the development headers for the libmtp library \
that allows access to USB based media players based on the MTP (Media \
Transfer Protocol) authored by Microsoft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.23"

RPM_NAME = "libmtp-devel-1.1.23-1.3.aarch64.rpm"
RPM_HASH = "02b808ac7ced659284f5f63d8a79e65ae2e0cbccb1f95f7caf6f0537d6b5e724e5546251273ad5f1516a4a5458ec52ad05d9792404c21487f8102fb9e972a564"

RPROVIDES:${PN} += "libmtp-devel \
pkgconfig-libmtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmtp9 \
pkgconfig-libusb-1.0"

inherit rpm
