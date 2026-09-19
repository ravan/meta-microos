SUMMARY = "A Modern Linker (mold)"
DESCRIPTION = "mold is a faster drop-in replacement for existing Unix linkers. \
It is several times faster than LLVM lld linker, the second-fastest \
open-source linker. \
mold is created for increasing developer productivity by reducing \
build time especially in rapid debug-edit-rebuild cycles."
LICENSE = "MIT"

PV = "2.41.0"

RPM_NAME = "mold-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "a9e1c207c6e788a957a9097525eec519e46273f2b6debd8894cc91d7477e0896c236986afc3516c63d5cef2ca6cecd84c65d76773b551072bbb4519d283ec62a"

RPROVIDES:${PN} += "mold"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1 \
libzstd.so.1"

inherit rpm
