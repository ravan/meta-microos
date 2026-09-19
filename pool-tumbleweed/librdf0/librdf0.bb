SUMMARY = "Libraries that provide support for the Resource Description Framework (RDF)"
DESCRIPTION = "Redland is a library that provides a high-level interface for RDF \
(Resource Description Framework) implemented in an object-based API. It \
is modular and supports different RDF parsers, serializers, storage and \
query languages.  Redland is designed for developers to provide RDF \
support in their applications as well as a core library for RDF \
developers to start with."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "librdf0-1.0.17-6.8.aarch64.rpm"
RPM_HASH = "0e8d992aceb4b9bc2f9b96e6c1fe9809bc3cd467425e17ab8a7951002bd352a496ac6b28337d7be926a470d58bb4cd732983181b34d40151aeca8f0d0039e2c0"

RPROVIDES:${PN} += "librdf.so.0 \
librdf0 \
libredland0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libraptor2.so.0 \
librasqal.so.3"

inherit rpm
