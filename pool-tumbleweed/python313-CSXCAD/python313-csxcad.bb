SUMMARY = "Python 3.13 bindings for CSXCAD"
DESCRIPTION = "This package contains Python 3.13 bindings for the CSXCAD \
library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "python313-CSXCAD-0.6.3-5.1.aarch64.rpm"
RPM_HASH = "3ab77085a936b85bbd6dc2ef074875882ca1184992f32556bdc5ddd0b8726a6664594e5656a751624dd47a155bdbaf3204338a683a0afd4fd75cc2fc5d606ecd"

RPROVIDES:${PN} += "python3-CSXCAD \
python3.13dist-csxcad \
python313-CSXCAD \
python3dist-csxcad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-matplotlib \
python313-numpy"

inherit rpm
