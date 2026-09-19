SUMMARY = "GNUnet library libgnunetrevocation"
DESCRIPTION = "This package contains the libgnunetrevocation library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetrevocation0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "3f96c0ab20f1ad97ad9b6185b74ae9cfe53155166acf78e44b1d4e5eec1cd95815642b70e2b5c2b8af836c9e4566deb783fd3ce3e363c32a2d37318a2b51310f"

RPROVIDES:${PN} += "libgnunetrevocation.so.0 \
libgnunetrevocation0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetgnsrecord.so.0 \
libgnunetutil.so.20"

inherit rpm
