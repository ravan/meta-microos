SUMMARY = "Development files libstemmer"
DESCRIPTION = "Snowball is a small string processing language for creating stemming algorithms \
for use in Information Retrieval, plus a collection of stemming algorithms \
implemented using it. \
 \
Snowball was originally designed and built by Martin Porter. Martin retired \
from development in 2014 and Snowball is now maintained as a community project. \
Martin originally chose the name Snowball as a tribute to SNOBOL, the excellent \
string handling language from the 1960s. It now also serves as a metaphor for \
how the project grows by gathering contributions over time. \
 \
The Snowball compiler translates a Snowball program into source code in another \
language - currently ISO C, C#, Go, Java, Javascript, Object Pascal, Python and \
Rust are supported. \
 \
This package holds the development files for libstemmer."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "snowball-devel-3.0.1-1.5.aarch64.rpm"
RPM_HASH = "5f3ae069bf72a960e9b86092df4385ec06d1d0f0c2d4896baf10ac0104b6aba126141aab10fbd63b6467fe9449a2497766da07dec2eda588461683171758aec0"

RPROVIDES:${PN} += "libstemmer-devel \
snowball-devel"

RDEPENDS:${PN} += "libstemmer1d"

inherit rpm
