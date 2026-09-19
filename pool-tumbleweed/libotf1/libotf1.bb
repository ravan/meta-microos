SUMMARY = "Shared library for libotf"
DESCRIPTION = "Library for handling OpenType fonts,especially those needed for CJK and other non-Latin \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.16"

RPM_NAME = "libotf1-0.9.16-2.9.aarch64.rpm"
RPM_HASH = "0c90692fd34f8760e159580175dbbca1357cfc31cecec2ebf31a3aef1d89a603920dfe96b862b15ac7a7e67233486ed2897779ceebe93b4628a3e04f57472a4c"

RPROVIDES:${PN} += "libotf.so.1 \
libotf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
