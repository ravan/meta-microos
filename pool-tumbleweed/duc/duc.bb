SUMMARY = "Collection of tools for inspecting and visualizing disk usage"
DESCRIPTION = "Duc is a collection of tools for inspecting and visualizing disk usage. \
 \
Duc scales quite well, it has been tested on systems with more than 500 million files and several petabytes of storage."
LICENSE = "LGPL-3.0-only"

PV = "1.4.6"

RPM_NAME = "duc-1.4.6-1.5.aarch64.rpm"
RPM_HASH = "8fb120cf24366045742139ffa3a8ef012a27bea906cc38634bd06218096476f13299d146ffb2bf445ef690a91e83f6305d4da9d65b4b6d2ecbcc2baf990d1566"

RPROVIDES:${PN} += "duc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglfw.so.3 \
libgobject-2.0.so.0 \
libm.so.6 \
libncursesw.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsqlite3.so.0 \
libtinfo.so.6"

inherit rpm
