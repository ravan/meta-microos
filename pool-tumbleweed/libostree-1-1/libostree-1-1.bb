SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2026.4"

RPM_NAME = "libostree-1-1-2026.4-1.1.aarch64.rpm"
RPM_HASH = "33b0b2f374540c81f9b72261cc9f1329228ce60e756b28785dfe4f0ed0d701208e1fc935f21081e36250a9c5415223b9284e3e3b3e221c16c2b0cdcf4a2c9574"

RPROVIDES:${PN} += "libostree-1-1 \
libostree-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcomposefs.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.45 \
liblzma.so.5 \
libselinux.so.1 \
libsystemd.so.0 \
libz.so.1"

inherit rpm
