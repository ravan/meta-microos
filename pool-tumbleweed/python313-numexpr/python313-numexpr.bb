SUMMARY = "Numerical expression evaluator for NumPy"
DESCRIPTION = "Numexpr is a numerical expression evaluator for NumPy. It is a C++ \
module. With it, expressions that operate on arrays (like '3*a+4*b') \
can be accelerated and use less memory than doing the same \
calculation in Python."
LICENSE = "MIT"

PV = "2.14.1"

RPM_NAME = "python313-numexpr-2.14.1-1.6.aarch64.rpm"
RPM_HASH = "74ae2608cb56a388965b92a2e302a265d65a66a3865628d7707acedfed2ad07624a0127961bc1048a18657b6d61ce4babada9e3f717f4f2491318519b853d3bc"

RPROVIDES:${PN} += "python3-numexpr \
python3.13dist-numexpr \
python313-numexpr \
python3dist-numexpr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
