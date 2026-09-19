SUMMARY = "Development files for libwapcaplet"
DESCRIPTION = "The libwapcaplet-devel package contains libraries and header files for \
developing applications that use libwapcaplet."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "libwapcaplet-devel-0.4.3-2.18.aarch64.rpm"
RPM_HASH = "31ad6e6018ffc303c113063166406d7560d07a09bbcadddb8409a7dd97c883572889129c57455a001a06707ed7cf63b82ecce72e1d6a87119a1ee33cb0a27bf3"

RPROVIDES:${PN} += "libwapcaplet-devel \
pkgconfig-libwapcaplet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwapcaplet0"

inherit rpm
