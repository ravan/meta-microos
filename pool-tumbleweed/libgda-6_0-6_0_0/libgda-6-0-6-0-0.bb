SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-6_0_0-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "bf4570c810f34695787a391859047b8b81c5b251211e60ce7c313c5a239027f4f75ae28f0c9b030ba8deb685f56081642d66a60ef32f6f6751502b9f1ef38adf"

RPROVIDES:${PN} += "libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0 \
libxml2.so.16"

inherit rpm
