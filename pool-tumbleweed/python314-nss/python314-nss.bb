SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python314-nss-1.0.1-7.12.aarch64.rpm"
RPM_HASH = "8e21dda5256bb65793a38a526c17f45c2d79a6e4885de3d076898f9c0f65a8053013d1d97cba3ea53a5f4f77fbf0100a884d1a15b9d46fa634ae69f7ce512209"

RPROVIDES:${PN} += "python3.14dist-python-nss \
python314-nss \
python3dist-python-nss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libssl3.so \
python-abi"

inherit rpm
