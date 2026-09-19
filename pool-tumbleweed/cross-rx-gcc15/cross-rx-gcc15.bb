SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-rx-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "3401b452f24c2722796f75feba900cf88dfc847aabb407efcce3b26288e6e5ade27683eb0c88b5e4d0da2e1ae0ac5febf90675c5673f6c8a69ca669ed8fdd20f"

RPROVIDES:${PN} += "cross-rx-gcc15 \
rx-elf-gcc"

RDEPENDS:${PN} += "cross-rx-binutils \
cross-rx-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
