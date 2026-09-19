SUMMARY = "Libraries that provide support for the Resource Description Framework (RDF)"
DESCRIPTION = "Redland is a library that provides a high-level interface for RDF \
(Resource Description Framework) implemented in an object-based API. It \
is modular and supports different RDF parsers, serializers, storage and \
query languages.  Redland is designed for developers to provide RDF \
support in their applications as well as a core library for RDF \
developers to start with."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "redland-1.0.17-6.8.aarch64.rpm"
RPM_HASH = "f09d13de899fa6d0854c2362d9011c0ff2141325743928c77af03e92ba10a7c28c3e2f423bfa74a253316feb1dcba72ead8c863994e5429c85586981e849326a"

RPROVIDES:${PN} += "librdf-storage-sqlite.so \
redland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0 \
librdf.so.0 \
libsqlite3.so.0"

inherit rpm
