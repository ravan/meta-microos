SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.8.21"

RPM_NAME = "python314-debugpy-1.8.21-1.3.aarch64.rpm"
RPM_HASH = "a1516dc145fa2752771c0639f97b4bb14f72eaeb32a3a0116d6012378533a59d0951e61c8cb95129e664df7ccecfd12ef6bf84681d90fe277d50fc1d7233c2e1"

RPROVIDES:${PN} += "python3.14dist-debugpy \
python314-debugpy \
python3dist-debugpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
