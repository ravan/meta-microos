SUMMARY = "GNUnet library libgnunetabd"
DESCRIPTION = "This package contains the libgnunetabd library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetabd0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "d3a1be6d08c67f273c6854046781caedf6628f24f0c9bc007ec805f3c9ab7a4708b13f62fe17163a7d0c64a89f4c0e7ca034a806c7fd00229f9cee4ad0cc3b7b"

RPROVIDES:${PN} += "libgnunetabd.so.0 \
libgnunetabd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
