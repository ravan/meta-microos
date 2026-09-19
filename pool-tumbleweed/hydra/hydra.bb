SUMMARY = "A network logon cracker with support for many different services"
DESCRIPTION = "A parallelized network login cracker, created as a proof of concept \
tool for security researchers to demonstrate how easy it can be to \
crack logins for a particular target. \
 \
Hydra works by using different approaches, such as brute-force \
attacks and dictionary attacks, in order to guess the right username \
and password combination."
LICENSE = "AGPL-3.0-only"

PV = "9.7+git20.gbccaea1"

RPM_NAME = "hydra-9.7+git20.gbccaea1-2.1.aarch64.rpm"
RPM_HASH = "2bfc55dec0f41202e246be78248a6c50cb81fec4cfd095b1e3e8c3e00e8bd6af98b609afd36200453306827822d3ca6d9c394501eb2ce0323bb2aa4991c6fd89"

RPROVIDES:${PN} += "hydra"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libbson2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libfreerdp3.so.3 \
libgcrypt.so.20 \
libidn.so.12 \
libm.so.6 \
libmariadb.so.3 \
libmemcached.so.11 \
libmongoc2.so.2 \
libpcre2-8.so.0 \
libpq.so.5 \
libsmbclient.so.0 \
libssh.so.4 \
libssl.so.3 \
libsvn-client-1.so.0 \
libsvn-subr-1.so.0 \
libwinpr3.so.3 \
libz.so.1"

inherit rpm
