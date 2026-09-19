SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.29.1"

RPM_NAME = "python314-pycairo-1.29.1-1.1.aarch64.rpm"
RPM_HASH = "5afa4c36a50f2c98dd597eb4e65d19ec1b6372bba28a9b758b67009912b39beca93249c34a1533d43769d2f3093da06adc7792d3dba7e064d14c987ff7704aee"

RPROVIDES:${PN} += "python3.14dist-pycairo \
python314-cairo \
python314-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
