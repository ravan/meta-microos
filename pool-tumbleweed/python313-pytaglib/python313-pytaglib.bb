SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "3.2.0"

RPM_NAME = "python313-pytaglib-3.2.0-1.4.aarch64.rpm"
RPM_HASH = "e8e5a85208c0db2b912b8a8a4090da38eef4922a0f491853f4ccb3f9e72056bb905a462fe8125ff702e49a229beb73027059b548714851f28a82acf0ec494f0b"

RPROVIDES:${PN} += "python3-pytaglib \
python3.13dist-pytaglib \
python313-pytaglib \
python3dist-pytaglib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.2 \
python-abi \
update-alternatives"

inherit rpm
