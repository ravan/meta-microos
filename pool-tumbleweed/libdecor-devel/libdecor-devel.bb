SUMMARY = "Development files for libdecor"
DESCRIPTION = "Libraries and header files for developing applications that target libdecor."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libdecor-devel-0.2.5-1.6.aarch64.rpm"
RPM_HASH = "be3de02fc272be1a6442bf14bef278fe94e0ac0ad2e0cb6b93dbcd47d536e025b4224dee8138422f9d130fd4d496d447a7610a4d79533090cbb0649eeef1cc01"

RPROVIDES:${PN} += "libdecor-devel \
pkgconfig-libdecor-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdecor-0-0 \
pkgconfig-wayland-client"

inherit rpm
