SUMMARY = "PMI-X plugins version 1"
DESCRIPTION = "This package contains plugins used by libpmix2."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-plugins-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "6f27434b1cd787f1b6a2c3f3ae1d625a1fc110d55f73e9c052c8feabe0fa19be791a4f4ed9b89dde559fa678d9ffae2249185e77976a54d5ea975f224d52c132"

RPROVIDES:${PN} += "pmix-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libmca-common-dstore.so.1 \
libmca-common-dstore1 \
libpmix.so.2 \
libz.so.1"

inherit rpm
