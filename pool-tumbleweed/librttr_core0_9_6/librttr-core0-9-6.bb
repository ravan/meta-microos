SUMMARY = "Run Time Type Reflection for C++"
DESCRIPTION = "Run Time Type Reflection is the the ability of a computer program to \
introspect and modify objects at runtime. It is also the name of the \
library itself, which is written in C++."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "librttr_core0_9_6-0.9.6-6.5.aarch64.rpm"
RPM_HASH = "c135869b972ef6ef8ce615b0fce5124f18fe6c0e551ab766f1c2911150dd4e12eab5755e22341302b2e1e862b435b1fd1860399677735bb4379a12a903307b58"

RPROVIDES:${PN} += "librttr-core.so.0.9.6 \
librttr-core0-9-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
