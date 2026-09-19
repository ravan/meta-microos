SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-rx-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "b444ba40e811b2132f7a0625f04592200a5a72696cfd0c8f211bd1b2f082076c58d0536edf5b5115e1045bac917d4b68aef938b3556253d5b6a784e8b184af9d"

RPROVIDES:${PN} += "cross-rx-gcc14 \
rx-elf-gcc"

RDEPENDS:${PN} += "cross-rx-binutils \
cross-rx-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
