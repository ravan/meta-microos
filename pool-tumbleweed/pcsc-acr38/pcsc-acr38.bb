SUMMARY = "PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.11"

RPM_NAME = "pcsc-acr38-1.7.11-9.5.aarch64.rpm"
RPM_HASH = "fe6bc8b7b22948897a6646c4d06dcb6b0e01756275e430c35e232a880e708ff6a5ccf6aa29ad3847bc4df39c24595c642703be875713f5e1e23ceaf0a5e252de"

RPROVIDES:${PN} += "pcsc-acr38"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
