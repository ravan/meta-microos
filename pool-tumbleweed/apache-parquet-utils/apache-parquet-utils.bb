SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides utilities for working with the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "apache-parquet-utils-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "f3e723a7bfc3321e1bc2ec423094ef002a3674f21f75307ea66c319083be1792530fb9c44a694681b4fc541042ff97381b931874bf1301066071a7e12465a91f"

RPROVIDES:${PN} += "apache-parquet-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.2500 \
libstdc++.so.6"

inherit rpm
