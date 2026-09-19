SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.8.21"

RPM_NAME = "python313-debugpy-1.8.21-1.3.aarch64.rpm"
RPM_HASH = "311c0d5c26ef227b14dcfdd70c7f604e445fdfbe0614811e70b528708fc8769b12835e3bbc7d369541310c9560a3256360326d865ccc64ed0f89c0444c366808"

RPROVIDES:${PN} += "python3-debugpy \
python3.13dist-debugpy \
python313-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
