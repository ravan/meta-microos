SUMMARY = "Devel package for poke"
DESCRIPTION = "Development package for poke."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "poke-devel-5.0-1.1.aarch64.rpm"
RPM_HASH = "54be4a26cb8b943abda424ebae96e3c9c2aa5451b78f444ccf196ca844066f81e2b8258e3c0c94c85b87a6f414f3820f5e002ab459520f409c8127b0df5532c2"

RPROVIDES:${PN} += "pkgconfig-poke \
poke-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoke2"

inherit rpm
