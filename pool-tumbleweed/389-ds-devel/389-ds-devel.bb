SUMMARY = "Development files for the 389 Directory Server"
DESCRIPTION = "389 Directory Server is a full-featured LDAPv3 compliant server. In \
addition to the standard LDAPv3 operations, it supports multi-master \
replication, fully online configuration and administration, chaining, \
virtual attributes, access control directives in the data, Virtual \
List View, server-side sorting, SASL, TLS/SSL, and many other \
features. \
 \
This package contains the development files for 389DS."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1+8c2711bd6"

RPM_NAME = "389-ds-devel-3.3.1+8c2711bd6-1.1.aarch64.rpm"
RPM_HASH = "c9d4e42793e479f16943c55669ee17d3e36c4913a6e9f15008672fd44da3901330284d03fe8638cad6dccadd4a4e3cea7dda96fd95227b47353642f55c294ce4"

RPROVIDES:${PN} += "389-ds-devel \
pkgconfig-dirsrv \
pkgconfig-svrcore \
svrcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
389-ds \
libevent-devel \
libsvrcore0 \
openldap2-devel \
pkgconfig \
pkgconfig-nspr \
pkgconfig-nss \
pkgconfig-systemd"

inherit rpm
