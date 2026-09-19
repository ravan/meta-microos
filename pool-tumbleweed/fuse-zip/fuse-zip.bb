SUMMARY = "File System to Navigate, Extract, Create and Modify ZIP Archives"
DESCRIPTION = "With fuse-zip you really can work with ZIP archives as real directories. \
Unlike KIO or Gnome VFS, it can be used in any application without \
modifications. \
Unlike other FUSE filesystems, only fuse-zip provides write support to \
ZIP archives. Also, fuse-zip is faster that all known implementations on \
large archives with many files."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.2+git.1733961742.3715770"

RPM_NAME = "fuse-zip-0.7.2+git.1733961742.3715770-1.5.aarch64.rpm"
RPM_HASH = "9495eb48362cf5e6e9b45f58814e83d4f4489ba4cc310cb36ba18e5c66d7b5d5d4839e8c1e620ff27f076d32d1365eb904df37bfd609d57154b51222cf720e5b"

RPROVIDES:${PN} += "fuse-zip"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
