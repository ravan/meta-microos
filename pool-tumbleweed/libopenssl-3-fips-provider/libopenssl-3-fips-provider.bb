SUMMARY = "OpenSSL FIPS provider"
DESCRIPTION = "This package contains the OpenSSL FIPS provider."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "libopenssl-3-fips-provider-3.5.3-8.3.aarch64.rpm"
RPM_HASH = "34801fbd92dc0e58991edf35bcb3edb8aa862bb07ef9ae8ed8b6f9140d53165675eed9553ab994b50dc2abb246f498f843cdc2f414e9f80a3bbc719f1cb01e80"

RPROVIDES:${PN} += "config-libopenssl-3-fips-provider \
libopenssl-3-fips-provider"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjitterentropy.so.3 \
libjitterentropy3 \
libopenssl3"

inherit rpm
