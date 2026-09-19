SUMMARY = "HTTP reverse proxy, backed by IPP-over-USB connection to device"
DESCRIPTION = "IPP-over-USB allows using the IPP protocol, normally designed for network \
printers, to be used with USB printers as well."
LICENSE = "BSD-2-Clause"

PV = "0.9.34"

RPM_NAME = "ipp-usb-0.9.34-1.3.aarch64.rpm"
RPM_HASH = "158477fe4124012e2fc2a86ef9234e1fc592a8ff198d8f6a605df39341ee332cc4ca22b895f6a3003cf0cfdeaf476a6428c948c6b69ffbc1f560bbd0ffcf462c"

RPROVIDES:${PN} += "config-ipp-usb \
ipp-usb"

RDEPENDS:${PN} += "/usr/bin/sh \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
