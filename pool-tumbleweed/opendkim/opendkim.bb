SUMMARY = "Milter based implementation of DKIM"
DESCRIPTION = "DomainKeys Identified Mail (DKIM) lets an organization take responsibility for \
a message that is in transit.  The organization is a handler of the message, \
either as its originator or as an intermediary. Their reputation is the basis \
for evaluating whether to trust the message for further handling, such as \
delivery. Technically DKIM provides a method for validating a domain name \
identity that is associated with a message through cryptographic \
authentication."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "opendkim-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "7938cac77fe5c215384908dd7f54e6647a3864c1c61131dbe4106baf02aaa125607f2f9f90d9eeaab84faaf574e65bd6c9c4f04fc159886a287f5196a35e6220"

RPROVIDES:${PN} += "config-opendkim \
group-opendkim \
opendkim \
user-opendkim"

RDEPENDS:${PN} += "/usr/bin/openssl \
/usr/bin/perl \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
liblber.so.2 \
libldap.so.2 \
liblua5.3.so.5 \
libm.so.6 \
libmemcached.so.11 \
libmilter.so.1.0 \
libopendkim.so.11 \
librbl.so.1 \
librepute.so.1 \
libssl.so.3 \
libunbound.so.8 \
libvbr.so.2"

inherit rpm
