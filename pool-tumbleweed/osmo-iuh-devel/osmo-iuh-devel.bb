SUMMARY = "Header files for the Osmocom Iuh libraries"
DESCRIPTION = "Osmocom code for the Service Area Broadcast Protocol interface. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-sabp."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "osmo-iuh-devel-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "ed47a5a3b1adafeab5c19d82ff3c0666b9f862df911be087a9c37b99070db0cfa2c00baf52a4992505eb08e654178b1f829680459d16738c0b299573a7327760"

RPROVIDES:${PN} += "osmo-iuh-devel \
pkgconfig-libosmo-hnbap \
pkgconfig-libosmo-ranap \
pkgconfig-libosmo-rua \
pkgconfig-libosmo-sabp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-hnbap0 \
libosmo-ranap7 \
libosmo-rua0 \
libosmo-sabp1"

inherit rpm
