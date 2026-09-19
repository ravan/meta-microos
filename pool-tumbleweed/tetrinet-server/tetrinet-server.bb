SUMMARY = "The GNU TetriNET server"
DESCRIPTION = "Tetrinetx-qirc1.40c with Async DNS support for high productivity \
server."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.16"

RPM_NAME = "tetrinet-server-1.13.16-345.6.aarch64.rpm"
RPM_HASH = "ad8c44932933b77bbb037ddd3815f81ca82f466191b319aecb3dfffc22e9fcfa12ab57834f59efa66c5667cae1d4d39784f3e74ac3b9aefe51d59770d8d07378"

RPROVIDES:${PN} += "tetrinet-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadns.so.1 \
libc.so.6"

inherit rpm
