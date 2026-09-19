SUMMARY = "Software version of a PKCS#11 Hardware Security Module"
DESCRIPTION = "OpenDNSSEC is providing a software implementation of a generic \
cryptographic device with a PKCS#11 interface, the SoftHSM. SoftHSM is \
designed to meet the requirements of OpenDNSSEC, but can also work together \
with other cryptographic products because of the PKCS#11 interface."
LICENSE = "BSD-2-Clause"

PV = "2.6.1+git.1732869438.f7883c2"

RPM_NAME = "softhsm-2.6.1+git.1732869438.f7883c2-2.7.aarch64.rpm"
RPM_HASH = "0fc979c18fa21e981b8a0f6abbbf14e881162f221aa04c77b82a3768d00dc2770162613200192c2e602452cd59c83db503d0a6a55ddf2310d6d651517492b92c"

RPROVIDES:${PN} += "config-softhsm \
group-ods \
libsofthsm2.so \
softhsm \
user-ods"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libplc4.so \
libplds4.so \
libsmime3.so \
libsoftokn3.so \
libsqlite3.so.0 \
libssl3.so \
libstdc++.so.6 \
libz.so.1 \
mozilla-nss-tools \
p11-kit \
shadow \
sysuser-shadow"

inherit rpm
