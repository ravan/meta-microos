SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2026.4"

RPM_NAME = "libostree-2026.4-1.1.aarch64.rpm"
RPM_HASH = "1bc6a6e5f349188b388abbe73b999719dca97836e244c6b3215f5ec7da241c0b3251b59c9429ca9888048469b332050c644d1345dd54521877f7908c5d0d10d3"

RPROVIDES:${PN} += "config-libostree \
libostree \
ostree"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcomposefs.so.1 \
libcrypto.so.3 \
libfuse3.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libostree-1.so.1 \
libselinux.so.1 \
libsystemd.so.0"

inherit rpm
