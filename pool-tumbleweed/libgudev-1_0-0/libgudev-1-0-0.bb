SUMMARY = "GObject library, to access udev device information"
DESCRIPTION = "This package contains the GObject library libgudev, which provides \
access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "238"

RPM_NAME = "libgudev-1_0-0-238-1.13.aarch64.rpm"
RPM_HASH = "18ded46f2fcfb4fbcf13f9e9087a589eccdf4c3ac61c46d5f9b72df94f2410bd86ea27345e0bb53707b7b94962a2e35f5ab2a45cdae50d2c0fb9864875140e6d"

RPROVIDES:${PN} += "libgudev-1-0-0 \
libgudev-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libudev.so.1"

inherit rpm
