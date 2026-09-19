SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-TxSNI-0.2.0-6.4.noarch.rpm"
RPM_HASH = "ea53aaaecb8c54843e0a2079c576ecaf75128621f863dc05a21a0aeea12d5fc2df272daea89f6dc90177f0d23f2fb51bb071dbfb4632f2ca41a9b46ffa71eefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TxSNI \
python3.13dist-txsni \
python313-TxSNI \
python3dist-txsni"

RDEPENDS:${PN} += "python-abi \
python313-Twisted-tls \
python313-pyOpenSSL"

inherit rpm
