SUMMARY = "Industrial I/O library -- iiod"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains a udev rule for granting access to IIO targets \
using the USB transport/backend."
LICENSE = "LGPL-2.1-or-later"

PV = "0.26"

RPM_NAME = "libiio-usb-udev-rules-0.26-1.10.aarch64.rpm"
RPM_HASH = "fadd6ad8138cd5206fd4f9a9782f3ee968457a1aae374f69dd4180594ceb461b807637e3d9b0affaa3259867e325b4c99b4861a0787bc514bf29316b31105bfd"

RPROVIDES:${PN} += "libiio-usb-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
