SUMMARY = "Python bindings for marisa"
DESCRIPTION = "Python bindings for marisa."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python314-marisa-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "2c45b117d59eb0e197ae00a8f9da4e66c97554d3be26b327c340b6b40b19009b4693b05285100d1962a7ff7998c51edb3b3756574b7fbb30a254e1a62926cb9c"

RPROVIDES:${PN} += "python3.14dist-marisa \
python314-marisa \
python3dist-marisa"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6 \
marisa \
python-abi"

inherit rpm
