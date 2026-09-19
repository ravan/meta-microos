SUMMARY = "python3 library for salt"
DESCRIPTION = " \
Python3 specific files for salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "python314-salt-3006.0-70.1.aarch64.rpm"
RPM_HASH = "51156801ea55272f73f385d79cc09d5a0ff7df581fa64133f6b27ea59ada58b77b2dd4f55d6d46a92e0d47c13ac41115dbfde2a9e3cf658efaab949992f5d132"

RPROVIDES:${PN} += "python3.14dist-salt \
python314-salt \
python3dist-salt \
salt-call"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
file \
iputils \
libzypp-plugin-system \
python-abi \
python314-Jinja2 \
python314-M2Crypto \
python314-MarkupSafe \
python314-PyYAML \
python314-base \
python314-contextvars \
python314-cryptography \
python314-distro \
python314-legacy-cgi \
python314-looseversion \
python314-msgpack-python \
python314-packaging \
python314-psutil \
python314-pyzmq \
python314-requests \
python314-rpm \
python314-tornado \
python314-xml \
python314-zypp-plugin \
salt \
sudo"

inherit rpm
