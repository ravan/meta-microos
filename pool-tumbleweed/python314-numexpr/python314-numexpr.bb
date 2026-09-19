SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.14.1"

RPM_NAME = "python314-numexpr-2.14.1-1.6.aarch64.rpm"
RPM_HASH = "dfa8922e5467eab383d53e8b2bf5e80bd8ac79c0756415ec542354c09702ab2ac12841b300587627167ead749d293b1fd769b9a187769aa59f65b44312d0fcfb"

RPROVIDES:${PN} += "python3.14dist-numexpr \
python314-numexpr \
python3dist-numexpr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
