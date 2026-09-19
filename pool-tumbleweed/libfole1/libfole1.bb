SUMMARY = "Library for Object Linking and Embedding (OLE) data types"
DESCRIPTION = "libfole is a library for Object Linking and Embedding (OLE) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfole1-20260521-1.6.aarch64.rpm"
RPM_HASH = "01ad41f76a195f5705b884ef04e85a4f3b419494d4225f9b95bf14d9c75b6da4eedb7ed6913e746752bceaf61fb5e5160d9002ed917a20ac36be23ca68cbc92d"

RPROVIDES:${PN} += "libfole.so.1 \
libfole1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcerror.so.1"

inherit rpm
