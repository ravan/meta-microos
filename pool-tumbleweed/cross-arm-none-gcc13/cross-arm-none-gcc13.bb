SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-arm-none-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "a83d21a32adb59deb250466c6ad346917c7bb865720eb686f725450f683658e2ebb5e2239e60c93658d47a5be7e3eff51cee42816837269b31f3ac314b288182"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13"

RDEPENDS:${PN} += "cross-arm-binutils \
cross-arm-none-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
