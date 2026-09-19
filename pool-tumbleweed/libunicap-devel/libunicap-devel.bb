SUMMARY = "Development files for the unicap library"
DESCRIPTION = "This package includes header files and libraries necessary for \
developing programs which use the unicap, unicapgtk, and ucil libraries. It \
contains the API documentation of the library, too."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.12"

RPM_NAME = "libunicap-devel-0.9.12-26.6.aarch64.rpm"
RPM_HASH = "639b22fdc0e23ca6bc118cfe119275553b8a45949f934ebf2c614a0f0c4c5d713fbde16b587cf6ea6c484a39b6d4088537296c903a51d76c9582ad20798dec0e"

RPROVIDES:${PN} += "libunicap-devel \
pkgconfig-libunicap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libunicap2"

inherit rpm
