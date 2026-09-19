SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9.1"

RPM_NAME = "python314-rsa-4.9.1-1.5.noarch.rpm"
RPM_HASH = "2cac290166168ad5e96348d6d1190c9accebb58c3862f7b3cd2f1cf7ea3d96dec9244574ebf92ea5875228f1bd6adf9ef031f1e87e9867da856e40b8b0d3c599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rsa \
python314-rsa \
python3dist-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
coreutils \
python-abi \
python314-pyasn1"

inherit rpm
