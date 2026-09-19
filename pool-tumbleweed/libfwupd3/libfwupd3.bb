SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "libfwupd3-2.1.7-2.1.aarch64.rpm"
RPM_HASH = "5934129147cadf40c72ab0b457e2c4d6e2b16f2ff89fa656e4269111d380c1553bb12923299749e96083b3f69e11d9fcccb2677815a8ada2d85f8479f4d73142"

RPROVIDES:${PN} += "libfwupd.so.3 \
libfwupd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
fwupd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
