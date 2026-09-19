SUMMARY = "A library for GUID/UUID data types"
DESCRIPTION = "A library for GUID/UUID data types. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfguid1-20260521-1.6.aarch64.rpm"
RPM_HASH = "31ea50a319ce09987038f9dc184efb4d53dd566c297b06d9f3e3ddc1e7f5058afb754672ccf34a22a580f323ca8372b4f57ed9bbea3ed8ea938db19369ae1824"

RPROVIDES:${PN} += "libfguid.so.1 \
libfguid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
