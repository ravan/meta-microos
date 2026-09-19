SUMMARY = "Python XML Signature and XAdES library"
DESCRIPTION = "SignXML is an implementation of the W3C XML Signature standard in \
Python. This standard (also known as 'XMLDSig') is used to provide payload security in SAML 2.0, \
EBICS, and `WS-Security, among other uses. The standard is defined in the `W3C Recommendation \
XML Signature Syntax and Processing Version 1.1."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python313-signxml-5.1.0-1.2.noarch.rpm"
RPM_HASH = "05bacc29e5117c158610591197c1e69fa7af2eaf89f572f6eadd4b6a16d5edd25b524593b1ff682a4f855ecca6f5ba29c8f5f4d7c9d6b7cb4ea300b28a5cadab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-signxml \
python3.13dist-signxml \
python313-signxml \
python3dist-signxml"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-cryptography \
python313-lxml"

inherit rpm
