SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "12bd781ab96b843d1725e5fea0161d36aadb115bfc17d002700249ec58aab0c957678fdb2990c21fc11806208bd91fbb9d67af234ab4fb7b463d8bef10723c19"

RPROVIDES:${PN} += "cross-rx-gcc7 \
liblto-plugin.so.0 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
