SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-TxSNI-0.2.0-6.4.noarch.rpm"
RPM_HASH = "83ed9f8caa9af9a4d67b292fd38007646b5ee0c36c889e792e78352d8ecc2166a0c098673c48cbce4850f4b07082da66d06ce28c1fbf9b5249d0c95541221689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-txsni \
python314-TxSNI \
python3dist-txsni"

RDEPENDS:${PN} += "python-abi \
python314-Twisted-tls \
python314-pyOpenSSL"

inherit rpm
