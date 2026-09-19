SUMMARY = "Shared library for mxml"
DESCRIPTION = "Mini-XML is a small XML parsing library that you can use to read XML \
and XML-like data files in your application without requiring large \
nonstandard libraries. \
 \
This package holds the shared library for mxml."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "libmxml1-3.3.1-1.13.aarch64.rpm"
RPM_HASH = "38cd08a62740cc4fac9e9606f64d9153def3dd226702fcee775d35c70316b759a10190ada9a4e633be6226c140612676b645db45bb96c24f3bc2603412c424a5"

RPROVIDES:${PN} += "libmxml.so.1 \
libmxml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
