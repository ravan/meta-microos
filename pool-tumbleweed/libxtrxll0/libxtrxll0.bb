SUMMARY = "XTRX Low-level API library"
DESCRIPTION = "Low level XTRX hardware abstraction library."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrxll0-0.0.0+git.20201202-3.9.aarch64.rpm"
RPM_HASH = "e4436f0b7b96ccb35d64ff3f8fbcefaa44ebd5f37d305e1fc41272ec2b973ec86aff83623fa91eb9e1ffdc02d67bc5e9d5f1810c1cd5fe2c08f0d7d12cf3bdab"

RPROVIDES:${PN} += "libxtrxll.so.0 \
libxtrxll0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb3380.so.0 \
xtrx-usb-udev"

inherit rpm
