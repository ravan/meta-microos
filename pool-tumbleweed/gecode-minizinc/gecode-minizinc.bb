SUMMARY = "Gecode minizinc solver"
DESCRIPTION = "Minizinc solver using the Gecode toolkit."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-minizinc-6.3.0~git20211208.6b09bea4-1.16.aarch64.rpm"
RPM_HASH = "e505c8672ef1581a3a92cb0e36c6acd2922c64724d3ea6b7a0490a76f18d155ef77897c818def791c982f1b34f487420cce7c163999cd6468bd54692045dffcb"

RPROVIDES:${PN} += "gecode-minizinc \
libgecodeflatzinc.so.51 \
minizinc-solver"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgecodedriver.so.51 \
libgecodefloat.so.51 \
libgecodeint.so.51 \
libgecodekernel.so.51 \
libgecodeminimodel.so.51 \
libgecodesearch.so.51 \
libgecodeset.so.51 \
libgecodesupport.so.51 \
libm.so.6 \
libstdc++.so.6 \
minizinc"

inherit rpm
