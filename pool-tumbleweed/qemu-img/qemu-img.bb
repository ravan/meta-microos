SUMMARY = "QEMU disk image utility"
DESCRIPTION = "This package provides command line tools for manipulating disk images."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-img-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "61e77c105adf92690d034e9a1b9eb6c545291b4e9bfbb5285fd0020f7db545b3751e6fc4daba812ea07058c6c9c79d19f98818bf2db1fa0de293318e16c80253"

RPROVIDES:${PN} += "qemu-img"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libfuse3.so.4 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libnuma.so.1 \
libpam.so.0 \
libselinux.so.1 \
liburing.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
