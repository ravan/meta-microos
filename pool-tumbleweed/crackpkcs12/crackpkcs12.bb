SUMMARY = "Multithreaded program to crack PKCS#12 files (p12 and pfx extensions)"
DESCRIPTION = "crackpkcs12 is a tool to audit PKCS#12 files passwords (extension .p12 or \
.pfx). It's written in C and uses openssl library."
LICENSE = "GPL-3.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "0.2.11"

RPM_NAME = "crackpkcs12-0.2.11-1.5.aarch64.rpm"
RPM_HASH = "314baeb9cec660291df6300f799f3d7b9ece9d6c5744f6f4fdde9bf62ad41277a3fe4595dec0c16f6c236ce12ac66620a5be48330188a80522b81a05c97597fe"

RPROVIDES:${PN} += "crackpkcs12"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
