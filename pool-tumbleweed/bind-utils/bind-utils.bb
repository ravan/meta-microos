SUMMARY = "Libraries for 'bind' and utilities to query and test DNS"
DESCRIPTION = "This package includes the utilities 'host', 'dig', and 'nslookup' used to \
test and query the Domain Name System (DNS) and also the libraries rquired \
for the base 'bind' package. The Berkeley Internet \
Name Domain (BIND) DNS server is found in the package named bind."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-utils-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "c8462fc75de83bf5097ec409290e37d05822386837ed9637ef025884a5fe2bf15cfd373c6af6bf5a60df826b415a9d581b243087d60e2f5dd9b7a2f8df8760c7"

RPROVIDES:${PN} += "bind-utils \
bind9-utils \
bindutil \
config-bind-utils \
dns-utils \
libdns-9.20.26.so \
libisc-9.20.26.so \
libisccc-9.20.26.so \
libisccfg-9.20.26.so \
libns-9.20.26.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfstrm.so.0 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libjemalloc.so.2 \
libjson-c.so.5 \
libkrb5.so.3 \
libm.so.6 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libprotobuf-c.so.1 \
libssl.so.3 \
liburcu-cds.so.8 \
liburcu-common.so.8 \
liburcu.so.8 \
libuv.so.1 \
libuv1 \
libxml2.so.16 \
libz.so.1"

inherit rpm
