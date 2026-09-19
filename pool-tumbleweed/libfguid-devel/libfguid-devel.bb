SUMMARY = "Development files for libfguid, a GUID/UUID data type library"
DESCRIPTION = "A library for GUID/UUID data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfguid."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfguid-devel-20260521-1.6.aarch64.rpm"
RPM_HASH = "02adea7d54b76ae0f24ac5e601c9e85c621141bd5c776818d90cdc835f8cd8c60cb41b513aab73b60f282d70db139fbfb5cad666165a4b31f54de34fa8cc92cf"

RPROVIDES:${PN} += "libfguid-devel \
pkgconfig-libfguid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfguid1"

inherit rpm
