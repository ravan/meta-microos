SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9.1"

RPM_NAME = "python313-rsa-4.9.1-1.5.noarch.rpm"
RPM_HASH = "54aaf110e661b66bb729d3c0cbf2badfaae6fbf1982f088d41104e9705ce1f5157f79bc9e83ecae011811321e400b86e7c41a938acb0e375dde5be9112106560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rsa \
python3.13dist-rsa \
python313-rsa \
python3dist-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
coreutils \
python-abi \
python313-pyasn1"

inherit rpm
