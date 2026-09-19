SUMMARY = "ASEDrive IIIe USB Smart Card Reader Driver"
DESCRIPTION = "This package contains a driver for the ASEDrive IIIe USB smart card \
reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asedriveiiie-usb-3.7-13.5.aarch64.rpm"
RPM_HASH = "aa806e006e1a183a778a80ad6d4523146014a48c1b979c8cbf61659c71c50ed334ca00f7eae15e5431a2e3087aa1b4729efdf1f33a1ae7e7bd5e1cfd2e162a85"

RPROVIDES:${PN} += "libASEDriveIIIe-USB.so \
pcsc-asedriveiiie-usb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
