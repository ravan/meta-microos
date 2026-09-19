SUMMARY = "Interpreter for S-Lang Scripts"
DESCRIPTION = "slsh is a standalone interpreter of the S-Lang language. It can be used to \
execute scripts, or be run interactively."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3+git16.89d32bb"

RPM_NAME = "slang-slsh-2.3.3+git16.89d32bb-2.7.aarch64.rpm"
RPM_HASH = "e37e11cd1df161a37a20a624850be67860701f2da662dbb5e29bf7adb5419276e4a3c0f33f9b7043bc8274b393787942e19b828445ffad505e0aeef4bd57c9b7"

RPROVIDES:${PN} += "config-slang-slsh \
slang \
slang-slsh"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libonig.so.5 \
libpng16.so.16 \
libslang.so.2 \
libz.so.1"

inherit rpm
