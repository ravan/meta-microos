SUMMARY = "Python 3 bindings for libcomps library"
DESCRIPTION = "This package provides the Python 3 bindings for libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.21"

RPM_NAME = "python3-libcomps-0.1.21-2.7.aarch64.rpm"
RPM_HASH = "bae49644f41cd451b5aa2d6c4a2138958855f0b58b8be920dc25d6d77f2f3f06e618221b698127c1aab121dd22d8996f87c2eb8cf209d599f7afc11373dada5d"

RPROVIDES:${PN} += "python3-libcomps \
python3.13dist-libcomps \
python3dist-libcomps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcomps.so.0 \
libcomps0 \
libpython3.13.so.1.0 \
libz.so.1 \
python-abi"

inherit rpm
