SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "python313-smpplib-2.2.3-3.9.noarch.rpm"
RPM_HASH = "5712fa70455af8c58d11342a261e366a4871519469f965f294cd02e52cdb9697ca648e5c774ab02ffbcdfe3e8a2cfa74fd5dffec4b845b6c1ff08b38d592897c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smpplib \
python3.13dist-smpplib \
python313-smpplib \
python3dist-smpplib"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
