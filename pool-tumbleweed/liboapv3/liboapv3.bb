SUMMARY = "Library files for openapv"
DESCRIPTION = "Library files for openapv."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.0"

RPM_NAME = "liboapv3-0.3.0.0-1.3.aarch64.rpm"
RPM_HASH = "8c2c9ed5e9f82458dcc61ed8af6a8ff525a5f795e1eac686def729e6707e774074a7c94414dab9e76c097f8c1200a9d5b0f7950218ab19b1789814e3c3500511"

RPROVIDES:${PN} += "liboapv.so.3 \
liboapv3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
