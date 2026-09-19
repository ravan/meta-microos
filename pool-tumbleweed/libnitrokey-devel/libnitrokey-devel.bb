SUMMARY = "Development files for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the development files."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey-devel-3.8-1.14.aarch64.rpm"
RPM_HASH = "6ffef634e102334e3728317ae56b313b3c11cc13e5bf5f6c6889f9e5be5019ee2b201546578e0e02d21bc2efe621b1e88d584b0a6d5e02c00e796efea9d204b1"

RPROVIDES:${PN} += "libnitrokey-devel \
pkgconfig-libnitrokey-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnitrokey3 \
pkgconfig-hidapi-libusb"

inherit rpm
