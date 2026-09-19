SUMMARY = "Z39.50 protocol server and client"
DESCRIPTION = "This package contains both a test-server and clients (normal & ssl) for \
the ANSI/NISO Z39.50 protocol for Information Retrieval.  SRW and SRU \
clients and servers are also supported."
LICENSE = "BSD-3-Clause"

PV = "5.38.0"

RPM_NAME = "yaz-5.38.0-1.1.aarch64.rpm"
RPM_HASH = "64f5e34227b769843a4fd576773223a9f68d975a58b8809a7d63a78eeabd679ba0ccf56f5fd199a58ac241fe24052df4ca6b014c3345cf699e53c80d3d541b48"

RPROVIDES:${PN} += "yaz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libicui18n.so.78 \
libicuuc.so.78 \
libreadline.so.8 \
libxml2.so.16 \
libyaz-icu.so.5 \
libyaz-server.so.5 \
libyaz.so.5"

inherit rpm
