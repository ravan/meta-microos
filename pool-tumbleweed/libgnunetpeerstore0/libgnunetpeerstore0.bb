SUMMARY = "GNUnet library libgnunetpeerstore"
DESCRIPTION = "This package contains the libgnunetpeerstore library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetpeerstore0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "707f03d387d7c49d604fbe48a31bbd6e33c107081aed9d85aefcfecc2f702b5c73b541ac54a3c8b7e2d9b5a89c82ee7ab64137729c652e896b0321d460a27d03"

RPROVIDES:${PN} += "libgnunetpeerstore.so.0 \
libgnunetpeerstore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunethello.so.0 \
libgnunetutil.so.20"

inherit rpm
