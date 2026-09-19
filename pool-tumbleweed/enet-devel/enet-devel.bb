SUMMARY = "Development files for libenet"
DESCRIPTION = "The libenet-devel package contains libraries and header files for \
developing applications that use libenet."
LICENSE = "MIT"

PV = "1.3.18"

RPM_NAME = "enet-devel-1.3.18-1.9.aarch64.rpm"
RPM_HASH = "9b210921d7ae9846890c5595f01142cc6df9ca07fad5429cf7f1e58094fe1b97b369776e8e7660081fdc49e5dab0bfcd5625039b030207eedb90e417d07f6361"

RPROVIDES:${PN} += "enet-devel \
pkgconfig-libenet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libenet7"

inherit rpm
