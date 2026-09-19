SUMMARY = "SeaDrive daemon with FUSE interface"
DESCRIPTION = "The Drive client enables you to access files on the server without \
syncing to local disk. It works like a network drive."
LICENSE = "GPL-2.0-only"

PV = "3.0.24"

RPM_NAME = "seadrive-fuse-3.0.24-1.2.aarch64.rpm"
RPM_HASH = "d4e7c7b961ea56e62dd6fa74be8dc5244d5a0e0aa7e0e4539ef117146b4630d2536f9e27b4e389d77df90fc6440a48508d8f461047e3dc3ea2304ee7855cc9d0"

RPROVIDES:${PN} += "seadrive-fuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevent-2.1.so.7 \
libfuse3.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libsearpc.so.1 \
libsqlite3.so.0 \
libuuid.so.1 \
libwebsockets.so.22 \
libz.so.1 \
python-abi"

inherit rpm
