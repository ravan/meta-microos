SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "python314-smpplib-2.2.3-3.9.noarch.rpm"
RPM_HASH = "a8d5a1281a30fcc95c3fd77d0f74f6a549840346dbb7a32d23be8a90775eb1c796f7cb0bdb07df02c1d0d5d2caa329db0d9857e7b2fee289f6c2dca06fe06924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-smpplib \
python314-smpplib \
python3dist-smpplib"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
