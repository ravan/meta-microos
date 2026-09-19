SUMMARY = "Development package for openobex"
DESCRIPTION = "Files needed for software development using openobex."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "openobex-devel-1.7.2-3.14.aarch64.rpm"
RPM_HASH = "181d0d0ac7d88d6a28db70a1c714c57d34f32255e2cc14fb3081cc9ac661f40beb6f939ab79e9f624a9a3ecb4a57668f7199835584a0f1668faa0a86a573a6f1"

RPROVIDES:${PN} += "cmake-openobex \
openobex-devel \
pkgconfig-openobex"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenobex2 \
pkgconfig-libusb-1.0"

inherit rpm
