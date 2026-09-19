SUMMARY = "File listing as a tree"
DESCRIPTION = "Tree is a recursive directory listing command that produces a depth \
indented listing of files, which is colorized ala dircolors if the \
LS_COLORS environment variable is set and output is to tty."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "tree-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "d6c11857f5705499b657b6eda3b3b8a342a8aef6cd990fe4fd553ce496bd96363f26a73bf8e48ab1ca11645e2134d7dd21eb0633c6a06c6a523ff59abe3b0c47"

RPROVIDES:${PN} += "tree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
