SUMMARY = "Shared library from leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the shared library of leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "libleveldb1-1.23-6.7.aarch64.rpm"
RPM_HASH = "75ab134a57827490e4a1405691eddc0cf72bc16721dd5479bb51348dba68ae89a684a44c212f2998c6ed107c02cdb7fd3f3cbd4d3749bc877dce921300a205f7"

RPROVIDES:${PN} += "leveldb \
libleveldb.so.1 \
libleveldb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsnappy.so.1 \
libstdc++.so.6"

inherit rpm
