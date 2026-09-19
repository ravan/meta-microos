SUMMARY = "PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.11"

RPM_NAME = "pcsc-acr38-devel-1.7.11-9.5.aarch64.rpm"
RPM_HASH = "5d35e9e43992965e809f68f0f33cde11efccf2d216b254575ebe0fab6bbb847031124ca7df499b95bb55e7f734cf95b641ff6f75592dfdcda82514c592ef7277"

RPROVIDES:${PN} += "pcsc-acr38-devel \
pkgconfig-libacr38ucontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacr38ucontrol0 \
pcsc-lite-devel"

inherit rpm
