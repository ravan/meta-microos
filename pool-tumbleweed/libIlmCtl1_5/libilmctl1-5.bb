SUMMARY = "Interpreter for the Color Transformation Language"
DESCRIPTION = "The IlmCtl library provides the CTL interpreter."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "libIlmCtl1_5-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "66aae04f0b997004f90d38ec600c099b70886dbba84461d14d8605a01c38837e2e5cffa6f19561ddb0c03df5921d7082a0e7994417fe6962cc42b69bc007269a"

RPROVIDES:${PN} += "libIlmCtl.so.1.5 \
libIlmCtl1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ctl-data \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
