SUMMARY = "An interactive, extensible editor for binary data"
DESCRIPTION = "GNU poke is an interactive, extensible editor for binary data. Not limited to \
editing basic entities such as bits and bytes, it provides a full-fledged \
procedural, interactive programming language designed to describe data \
structures and to operate on them."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "poke-5.0-1.1.aarch64.rpm"
RPM_HASH = "82b6c4dece59951fa7b475bc5d740d8e742a44f4e80be14e927d5eba0c1f160af5578c44085525d00effa5ee955a55e7df1dde4768ab7fb6d24bf99ee63e819f"

RPROVIDES:${PN} += "poke"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpoke.so.2 \
libreadline.so.8 \
libtextstyle.so.0 \
libtinfo.so.6"

inherit rpm
