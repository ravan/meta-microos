SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.88.1"

RPM_NAME = "gjs-1.88.1-2.1.aarch64.rpm"
RPM_HASH = "75a8f3db2f804394d4d5d575334cdafba6f7227e928575b44a41c2de38755108e9c0953ae314ea060337bd678f547d56957e5b5262d995f38d4a91ff501e1b5d"

RPROVIDES:${PN} += "gjs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgjs.so.0 \
libgjs0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-140.so.0"

inherit rpm
