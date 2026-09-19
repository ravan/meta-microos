SUMMARY = "Library for Transactional Registry (TxR) data types"
DESCRIPTION = "libftxr is a library for Transactional Registry (TxR) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libftxr1-20260521-1.6.aarch64.rpm"
RPM_HASH = "68c1a2224d8641414c317c1e99ac32c6777d795657cac594cc5f63117f54c38ef398177a5f0a65f1c4485f439b78fb3426476f8450e1b049f2cc610c6970457e"

RPROVIDES:${PN} += "libftxr.so.1 \
libftxr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1"

inherit rpm
