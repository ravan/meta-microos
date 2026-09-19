SUMMARY = "PKI testing tool"
DESCRIPTION = "PKI testing tool"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python314-certomancer-0.14.0-1.2.noarch.rpm"
RPM_HASH = "6b1e5a16d2f90868d42348b2fe3a86469168399b9ebf81d49c7c486689ee66af6811ca0f0087edfda8bd54d68984c8a567bc7e1ba5874be3356aaf86f35b32f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certomancer \
python314-certomancer \
python3dist-certomancer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-asn1crypto \
python314-click \
python314-cryptography \
python314-python-dateutil \
python314-tzlocal"

inherit rpm
