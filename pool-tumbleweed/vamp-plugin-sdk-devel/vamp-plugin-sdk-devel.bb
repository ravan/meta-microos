SUMMARY = "Development files for vamp-plugin-sdk"
DESCRIPTION = "The vamp-plugin-sdk-devel package contains documentation examples and \
header files for developing applications that use vamp-plugin-sdk."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "vamp-plugin-sdk-devel-2.10.0-1.24.aarch64.rpm"
RPM_HASH = "8bc773d62c06c19d53bf838ec544126f052aae9f4b4cb5a82db2dadb5d5ec4d33c809d01776085f83b0a5a52c440f4b7f31c556c2441c8fc86b8e449494c32e9"

RPROVIDES:${PN} += "pkgconfig-vamp \
pkgconfig-vamp-hostsdk \
pkgconfig-vamp-sdk \
vamp-plugin-sdk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvamp-hostsdk3 \
libvamp-sdk2 \
pkgconfig \
vamp-plugin-sdk"

inherit rpm
