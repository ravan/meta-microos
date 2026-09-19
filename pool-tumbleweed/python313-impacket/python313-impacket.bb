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

RPM_NAME = "python313-impacket-0.13.1-1.2.noarch.rpm"
RPM_HASH = "088e44358930ed73c0b7d62f42045a0d192d28148f5122b5fa75b104270e5be03f0a037fb2954b77da15a2b7e056dc8809a3f6cf09f5978a61152d3e92b22773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-impacket \
python3.13dist-impacket \
python313-impacket \
python3dist-impacket"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Flask \
python313-charset-normalizer \
python313-ldap3 \
python313-ldapdomaindump \
python313-pyOpenSSL \
python313-pyasn1 \
python313-pycryptodomex \
python313-six \
update-alternatives"

inherit rpm
