SUMMARY = "Hardware detection library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "25.5"

RPM_NAME = "libhd25-25.5-1.1.aarch64.rpm"
RPM_HASH = "a55259b65e9ff1cb8b31ea6c6765fbcada13cc432d50c980c4ea36196b25f549cb3d36984e72082a6945925c4100d4128d421faa79d2252f304ef705b7d9ff32"

RPROVIDES:${PN} += "libhd \
libhd.so.25 \
libhd25"

RDEPENDS:${PN} += "/usr/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
