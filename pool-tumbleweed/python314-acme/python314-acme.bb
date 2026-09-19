SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python314-acme-5.8.0-1.1.noarch.rpm"
RPM_HASH = "11080b819225b13a8d9875338b826cae3623001e024db359d8769928f6fd405c9c5b0ffa61b4f082139076264faba75d03175852f46266ace1b2d8cb66ce85d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-acme \
python314-acme \
python3dist-acme"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-josepy \
python314-pyOpenSSL \
python314-pyRFC3339 \
python314-requests"

inherit rpm
