SUMMARY = "A library for parsing and generating BSON documents"
DESCRIPTION = "Libbson is a library providing useful routines related to \
building, parsing, and iterating BSON documents. It is a \
useful base for those wanting to write high-performance \
C extensions to higher level languages such as Python, \
Ruby, or Perl."
LICENSE = "Apache-2.0 & ISC & MIT & Zlib"

PV = "2.5.3"

RPM_NAME = "libbson2-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "b6ca5dc10d50bc23d8cdf4f63127a5ae2228105a67e8d2b32bc1c1f93fe47c1c69812fd98d84ed2f4e4f8e622866f1d587ba844663e09c5f438f00a708c0b977"

RPROVIDES:${PN} += "libbson2 \
libbson2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
pkgconfig-libsasl2"

inherit rpm
