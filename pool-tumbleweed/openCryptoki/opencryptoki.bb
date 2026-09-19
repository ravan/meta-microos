SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "Opencryptoki implements the PKCS#11 specification v2.20 for a set of \
cryptographic hardware, such as IBM 4764 and 4765 crypto cards, and the \
Trusted Platform Module (TPM) chip. Opencryptoki also brings a software \
token implementation that can be used without any cryptographic \
hardware. \
This package contains the Slot Daemon (pkcsslotd) and general utilities."
LICENSE = "CPL-1.0"

PV = "3.27.0"

RPM_NAME = "openCryptoki-3.27.0-3.1.aarch64.rpm"
RPM_HASH = "5b09d02821abf32e925473ad3d27caf5895990a695ed3e8819d7fbca5cd7c92d9f48715a6ea21bbb5a3ea942e63871e24dead15186735b914a05da6f8bee2679"

RPROVIDES:${PN} += "config-openCryptoki \
group-pkcs11 \
group-pkcsslotd \
openCryptoki \
user-pkcs11 \
user-pkcsslotd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libssl.so.3 \
systemd \
sysuser-shadow"

inherit rpm
