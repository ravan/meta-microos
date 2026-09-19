SUMMARY = "Library for digital signing and verification of digital signatures"
DESCRIPTION = "Library for digital signing and verification of digital signatures in mail, PDF and XML documents."
LICENSE = "MIT"

PV = "2.18.5"

RPM_NAME = "python314-endesive-2.18.5-1.5.noarch.rpm"
RPM_HASH = "98b294badf7fa7451675d058482d981eca1f75f0d3183cefcdd4040b19b434304299eed2c25814cee544411ac393167e313dc9858ec1c2c8ad9458109867d9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-endesive \
python314-endesive \
python3dist-endesive"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-PyKCS11 \
python314-asn1crypto \
python314-attrs \
python314-certvalidator \
python314-cryptography \
python314-lxml \
python314-paramiko \
python314-pytz \
python314-requests"

inherit rpm
