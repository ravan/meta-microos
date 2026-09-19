SUMMARY = "Dynamic library to access the UDisksd daemon"
DESCRIPTION = "This package contains the dynamic library, which provides \
access to the UDisksd daemon."
LICENSE = "LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "libudisks2-0-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "d9122539928e9361832c4477be5fd5f861d720f2a1fd603733b3f570a7b12fc96aa8c494135f786dac25b9ba77f7676843d8e152b1e2982d6b170946f25f0890"

RPROVIDES:${PN} += "libudisks2-0 \
libudisks2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
