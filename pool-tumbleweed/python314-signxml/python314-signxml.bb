SUMMARY = "Python XML Signature and XAdES library"
DESCRIPTION = "SignXML is an implementation of the W3C XML Signature standard in \
Python. This standard (also known as 'XMLDSig') is used to provide payload security in SAML 2.0, \
EBICS, and `WS-Security, among other uses. The standard is defined in the `W3C Recommendation \
XML Signature Syntax and Processing Version 1.1."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python314-signxml-5.1.0-1.2.noarch.rpm"
RPM_HASH = "5eb9d610d89a2a2e92c5cc0df1fe1f091fb7728129b68d32f251358d84428a83a1fcdca4a9a3c83bdde6c28e0c872cee7457831e6e1b135d531f956f7c6bbf1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-signxml \
python314-signxml \
python3dist-signxml"

RDEPENDS:${PN} += "python-abi \
python314-certifi \
python314-cryptography \
python314-lxml"

inherit rpm
