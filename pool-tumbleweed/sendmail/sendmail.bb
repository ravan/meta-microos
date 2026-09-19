SUMMARY = "BSD Sendmail"
DESCRIPTION = "The 'Unix System Administration Handbook' calls sendmail 'The most \
complex and complete mail delivery system in common use...' . \
 \
Ready-made configuration files are included for systems connected by \
TCP/IP (with or without a name server) and for systems using UUCP. \
 \
'procmail' is used as a local mail agent. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.18.2"

RPM_NAME = "sendmail-8.18.2-3.3.aarch64.rpm"
RPM_HASH = "b017b416fc8a7cf5ba93a510f112b438363567577ac1703193534d9aca72ec02898f8a3a6eb19238387a1e6b528e841a417d291cdef60ab90aa5899aae5b994c"

RPROVIDES:${PN} += "config-sendmail \
sendcf \
sendmail \
sendmail-tls \
smailcfg \
smtp-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/fuser \
/usr/bin/mkdir \
/usr/bin/openssl \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/timeout \
/usr/bin/touch \
ca-certificates \
coreutils \
filesystem \
fillup \
findutils \
group-daemon \
group-mail \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libicuuc.so.78 \
liblber.so.2 \
libldap.so.2 \
libnss-usrfiles2 \
libsasl2.so.3 \
libssl.so.3 \
libwrap.so.0 \
m4 \
make \
netcfg \
permissions \
permissions-config \
procmail \
sed \
user-daemon \
user-mail"

inherit rpm
