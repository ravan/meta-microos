SUMMARY = "Python bindings for marisa"
DESCRIPTION = "Python bindings for marisa."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "python313-marisa-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "b805873f594286826fd521807f2e377f83bc23223fc394ad1ff05a458214d2b4f23f1b2b567ad0b00fb0c6d6ba1d489e3396845a0bcdaeabca8bf18d99b22d57"

RPROVIDES:${PN} += "python3-marisa \
python3.13dist-marisa \
python313-marisa \
python3dist-marisa"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6 \
marisa \
python-abi"

inherit rpm
