SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for Arrow Flight SQL"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libarrow_flight_sql2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "aacaed8fb93e17ac3afbe68e945eda6ab5bb13fc4b61ea4312e370e6eccdaecd7b78084e6bf7aa49b39e4749e7947bc7ad68d958fac42e141fa59d1e1720dfd3"

RPROVIDES:${PN} += "libarrow-flight-sql.so.2500 \
libarrow-flight-sql2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libarrow-flight.so.2500 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libstdc++.so.6"

inherit rpm
