SUMMARY = "python3 library for salt"
DESCRIPTION = " \
Python3 specific files for salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python313-salt-3006.0-70.1.aarch64.rpm"
RPM_HASH = "5483161677d90dc4de55d4835d08bc932c3bf48dabe1a91379ebe7f6a9971013a0348eb092f069e81d7364d7a78d9401e2806b3b4179f05dcbe7760ee81a2518"

RPROVIDES:${PN} += "python3-salt \
python3.13dist-salt \
python313-salt \
python3dist-salt \
salt-call"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
file \
iputils \
libzypp-plugin-system \
python-abi \
python313-Jinja2 \
python313-M2Crypto \
python313-MarkupSafe \
python313-PyYAML \
python313-base \
python313-contextvars \
python313-cryptography \
python313-distro \
python313-legacy-cgi \
python313-looseversion \
python313-msgpack-python \
python313-packaging \
python313-psutil \
python313-pyzmq \
python313-requests \
python313-rpm \
python313-tornado \
python313-xml \
python313-zypp-plugin \
salt \
sudo"

inherit rpm
