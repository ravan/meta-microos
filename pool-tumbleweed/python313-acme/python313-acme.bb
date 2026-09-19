SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-acme-5.8.0-1.1.noarch.rpm"
RPM_HASH = "7386e1fb2fdecf4d07a15b3ecaf90db2fc812ef0c3b30fb88754224ee41fbdb6e4386145c9bafee7c294ac704ebd1bd66b30425b7a3c6ffe5884643c1175196f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-acme \
python3.13dist-acme \
python313-acme \
python3dist-acme"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-josepy \
python313-pyOpenSSL \
python313-pyRFC3339 \
python313-requests"

inherit rpm
