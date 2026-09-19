SUMMARY = "Shared library for libstemmer"
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
This package holds the shared library for libstemmer."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "libstemmer1d-3.0.1-1.5.aarch64.rpm"
RPM_HASH = "6efd0bcab7ef267bf847555d9212aa910363dc0f3086eea0bd601551ee524dd3fa06ed169123a055f8e1becba2938d9858c1634874550b6d23ff9e9c735d3030"

RPROVIDES:${PN} += "libstemmer.so.0d \
libstemmer1d"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
