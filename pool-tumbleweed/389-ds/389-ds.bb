SUMMARY = "389 Directory Server"
DESCRIPTION = "389 Directory Server is a full-featured LDAPv3 compliant server. In \
addition to the standard LDAPv3 operations, it supports multi-master \
replication, fully online configuration and administration, chaining, \
virtual attributes, access control directives in the data, Virtual \
List View, server-side sorting, SASL, TLS/SSL, and many other \
features. (The server started out as Netscape Directory Server.)"
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1+8c2711bd6"

RPM_NAME = "389-ds-3.3.1+8c2711bd6-1.1.aarch64.rpm"
RPM_HASH = "f690e5dd73ac7002b9e52471f4caabcafb7abbdeaa04dc2626348a2a5d2d438a120e2415169c7cb43d6a46ebef96fd3825d3d209975cf08702e1e0542755209d"

RPROVIDES:${PN} += "389-ds \
389-ds-base \
config-389-ds \
group-dirsrv \
libacctpolicy-plugin.so \
libacctusability-plugin.so \
libacl-plugin.so \
libaddn-plugin.so \
libalias-entries-plugin.so \
libattr-unique-plugin.so \
libautomember-plugin.so \
libback-ldbm.so \
libbitwise-plugin.so \
libchainingdb-plugin.so \
libcollation-plugin.so \
libcontentsync-plugin.so \
libcos-plugin.so \
libderef-plugin.so \
libdistrib-plugin.so \
libdna-plugin.so \
libentryuuid-plugin.so \
libentryuuid-syntax-plugin.so \
libldaputil.so.0 \
liblinkedattrs-plugin.so \
libmanagedentries-plugin.so \
libmemberof-plugin.so \
libns-dshttpd.so.0 \
libpam-passthru-plugin.so \
libpassthru-plugin.so \
libpbe-plugin.so \
libposix-winsync-plugin.so \
libpwdchan-plugin.so \
libpwdstorage-plugin.so \
libreferint-plugin.so \
libreplication-plugin.so \
libretrocl-plugin.so \
librewriters.so.0 \
librobdb.so \
libroles-plugin.so \
librootdn-access-plugin.so \
libschemareload-plugin.so \
libslapd.so.0 \
libstatechange-plugin.so \
libsyntax-plugin.so \
libusn-plugin.so \
libviews-plugin.so \
libwhoami-plugin.so \
user-dirsrv"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3.13 \
/usr/bin/sh \
/usr/sbin/service \
acl \
cyrus-sasl-plain \
db-utils \
fillup \
krb5 \
ld-linux-aarch64.so.1 \
lib389 \
libc.so.6 \
libcom-err.so.2 \
libcrack.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libjson-c.so.5 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
liblmdb-0.9.35.so \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpam.so.0 \
libpcre2-8.so.0 \
libplc4.so \
libplds4.so \
libsasl2.so.3 \
libsmime3.so \
libssl.so.3 \
libssl3.so \
libsvrcore.so.0 \
libsystemd.so.0 \
libz.so.1 \
permissions \
sysuser-shadow"

inherit rpm
