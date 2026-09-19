SUMMARY = "HTTP Regression Testing/Benchmarking Utility"
DESCRIPTION = "Siege is a regression test and benchmark utility. It can stress test a \
single URL with a user defined number of simulated users, or it can read \
many URLs into memory and stress them simultaneously. The program reports \
the total number of hits recorded, bytes transferred, response time, \
concurrency, and return status. Siege supports HTTP/1.0 and 1.1 protocols, \
GET and POST directives, cookies, transaction logging, and basic \
authentication. Its features are configurable on a per user basis. Since \
3.0.0 it also supports FTP."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "siege-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "00e1e09097f60dc0cd3fae6bdff18547c9755403453113592bfc7006ebc8c19a594a08de929c2982e476058e22fb965627f8c7a67f68c401d3110a9ee1b52151"

RPROVIDES:${PN} += "config-siege \
siege"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
