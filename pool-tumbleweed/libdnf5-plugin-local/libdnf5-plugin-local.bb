SUMMARY = "Libdnf5 plugin that downloads all packages to a local repository"
DESCRIPTION = "Libdnf5 plugin that automatically copies all downloaded packages to \
a repository on the local filesystem and generates repo metadata."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-plugin-local-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "6af3f1fad300a3ed2f1baea4f00ef3af81e6ce2ebeb2c5054ca88a70013fba3b4181607b8a3708707b7a30ab08657b7e8b65c0f0f470af82bc4dfd208b0e2be4"

RPROVIDES:${PN} += "config-libdnf5-plugin-local \
libdnf5-plugin-local"

RDEPENDS:${PN} += "createrepo-c \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
