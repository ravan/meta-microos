SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "7eaafdbce5f071a9ae0e1d579bcad381b7fa2aed728825b82942fcabf9b5844e7c958ab747726cebd8c74fff93b8514db65186c3f73c13a323d4a48aa5cff3ea"

RPROVIDES:${PN} += "bind \
bind8 \
bind9 \
config-bind \
dns-daemon \
group-named \
user-named"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
bind-utils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-9.20.26.so \
libfstrm.so.0 \
libisc-9.20.26.so \
libisccc-9.20.26.so \
libisccfg-9.20.26.so \
libjemalloc.so.2 \
libjson-c.so.5 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libns-9.20.26.so \
libprotobuf-c.so.1 \
liburcu.so.8 \
libuv.so.1 \
libxml2.so.16 \
libz.so.1 \
sysuser-shadow"

inherit rpm
