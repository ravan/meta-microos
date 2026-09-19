SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "This is a re-packaged binary rpm. For the package source, please look \
for the source of the package without the '64bit' ending \
 \
The PKCS#11 version 2.11 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
coprocessor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.27.0"

RPM_NAME = "openCryptoki-64bit-3.27.0-3.1.aarch64.rpm"
RPM_HASH = "bf81b5816236fb5fbee5b02ee5707e7493ea25ff926e92c2247e61f8febbcd6948a13fe98f12619f27ec5182dcb213115af5605f8a018fee1193c6d8991aba75"

RPROVIDES:${PN} += "libopencryptoki.so.0 \
libpkcs11-cca.so.0 \
libpkcs11-icsf.so.0 \
libpkcs11-sw.so.0 \
libpkcs11-tpm.so.0 \
openCryptoki-64bit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libtspi.so.1 \
openCryptoki"

inherit rpm
