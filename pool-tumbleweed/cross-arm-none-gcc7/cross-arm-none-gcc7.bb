SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "751b8b439e6f56bcab4a81297d09f4a89e318cab90765de3d3574576f3f54c4fc4d25246b579d784063241ce37566f3475dfd13b4dcecb59f5a8be0ee65d39fc"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
