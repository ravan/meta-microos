SUMMARY = "Cryptographic filesystem for the cloud"
DESCRIPTION = "CryFS provides a FUSE-based mount that encrypts file contents, file \
sizes, metadata and directory structure. It uses encrypted same-size \
blocks to store both the files themselves and the blocks' relations \
to one another. These blocks are stored as individual files in the \
base directory, which can then be synchronized to remote storage \
(using an external tool)."
LICENSE = "LGPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "cryfs-1.0.3-1.8.aarch64.rpm"
RPM_HASH = "5b5434fe3f704b90e5b83698445c5c4fe87459c0a597f07fdde39d025fa810d19b076da5e9caad944f5935bc57c8df62104627c419cbd026a45e9f269fcc61a6"

RPROVIDES:${PN} += "bundled-libcryptopp \
cryfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-chrono.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libfmt.so.12 \
libfuse3.so.4 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libspdlog.so.1.17 \
libstdc++.so.6"

inherit rpm
