SUMMARY = "Development files for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
This package contains development files for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc-devel-0.8.2-4.3.aarch64.rpm"
RPM_HASH = "3c66f347fe13a3e58a05a4770a170db79b1fa8057a5b23dd3b73ecabff9bb1b944cba62b0a8b0b840500e3a9bddb21c4afbed9c826e0b9c75611f5aa1bc99303"

RPROVIDES:${PN} += "libsoc-devel \
pkgconfig-libsoc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoc2"

inherit rpm
