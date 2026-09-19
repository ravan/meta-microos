SUMMARY = "Python bindings for mozilla-nss and mozilla-nspr"
DESCRIPTION = "python-nss is a Python binding for NSS (Network Security Services) and \
NSPR (Netscape Portable Runtime). NSS provides cryptography services \
supporting SSL, TLS, PKI, PKIX, X509, PKCS*, etc. NSS is an \
alternative to OpenSSL and used extensively by major software \
projects. NSS is FIPS-140 certified."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python313-nss-1.0.1-7.12.aarch64.rpm"
RPM_HASH = "a094c85e4e2ccce1693d91fe488368adff547a0db82705ba92d22803fc4246a57abeb2f77e4731dd9f64db149e9fa18869e79be046523153bed9d4a2d35ce5dc"

RPROVIDES:${PN} += "python3-nss \
python3.13dist-python-nss \
python313-nss \
python3dist-python-nss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libssl3.so \
python-abi"

inherit rpm
