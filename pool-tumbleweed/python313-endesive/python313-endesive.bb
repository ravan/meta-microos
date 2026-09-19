SUMMARY = "Library for digital signing and verification of digital signatures"
DESCRIPTION = "Library for digital signing and verification of digital signatures in mail, PDF and XML documents."
LICENSE = "MIT"

PV = "2.18.5"

RPM_NAME = "python313-endesive-2.18.5-1.5.noarch.rpm"
RPM_HASH = "ecfebc3357d7170778312d3da45039cb4818dfb1dc612cd7e3bf2332cb5237f6dd52c02e9a55746bd91e8bee38a6692fdd9712ac79d712b7517ea4dd90340e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-endesive \
python3.13dist-endesive \
python313-endesive \
python3dist-endesive"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-PyKCS11 \
python313-asn1crypto \
python313-attrs \
python313-certvalidator \
python313-cryptography \
python313-lxml \
python313-paramiko \
python313-pytz \
python313-requests"

inherit rpm
