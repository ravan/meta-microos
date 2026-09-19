SUMMARY = "Python3 module to easily build and dissect network protocols"
DESCRIPTION = "Impacket is a collection of Python classes for working with network \
protocols. Impacket is focused on providing low-level \
programmatic access to the packets and for some protocols (e.g. \
SMB1-3 and MSRPC) the protocol implementation itself. \
Packets can be constructed from scratch, as well as parsed from \
raw data, and the object oriented API makes it simple to work with \
deep hierarchies of protocols. The library provides a set of tools \
as examples of what can be done within the context of this library."
LICENSE = "Apache-1.1"

PV = "0.13.1"

RPM_NAME = "python314-impacket-0.13.1-1.2.noarch.rpm"
RPM_HASH = "1605e1c91e5ddff4c20ee84bb770ae88ad09a90870147a44a18d775adb425742845b9170299d55be309062cd3ee44c3a6a574ec62a51e1ff052360a46b9d5dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-impacket \
python314-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Flask \
python314-charset-normalizer \
python314-ldap3 \
python314-ldapdomaindump \
python314-pyOpenSSL \
python314-pyasn1 \
python314-pycryptodomex \
python314-six \
update-alternatives"

inherit rpm
