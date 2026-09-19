SUMMARY = "Squafs Tools for squashfsfuse"
DESCRIPTION = "Demo tools from squashfsfuse package to list and extract files from a \
squashfs file system (no man pages)."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "squashfuse-tools-0.6.1-1.7.aarch64.rpm"
RPM_HASH = "e92dee703599798bf7fbf96058b6f3186985a7625a0e233d813370464458026f3eb1d4f01c090a83bbb69b20d8188422b8758226df756e69cabe9cef3095b99e"

RPROVIDES:${PN} += "squashfuse-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsquashfuse.so.0"

inherit rpm
