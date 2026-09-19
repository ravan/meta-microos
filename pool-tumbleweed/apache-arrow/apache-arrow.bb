SUMMARY = "A development platform for in-memory data"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "apache-arrow-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "c7725058338cd47888269d9769b39bd520d2c41a83d7d87e8cd409a34ffd81d33c34c64967976cb8e87265c3afeb009c224c86229aab317dd409bfe7c1c02277"

RPROVIDES:${PN} += "apache-arrow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
