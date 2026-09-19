SUMMARY = "IDL Parsing Library"
DESCRIPTION = "LibIDL is a small library for creating parse trees of CORBA \
v2.2-compliant Interface Definition Language (IDL) files. IDL is a \
specification for defining interfaces that can be used between \
different CORBA implementations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.14"

RPM_NAME = "libIDL-2-0-0.8.14-24.10.aarch64.rpm"
RPM_HASH = "b509c8289b3e30c464c6670a550caebf478b57aae1168424ab5849937b4b99cf452905bda4b0d8488b36f26194ef7891f11996615663932f9ef0fc61116d97b1"

RPROVIDES:${PN} += "libIDL-2-0 \
libIDL-2.so.0 \
libidl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
