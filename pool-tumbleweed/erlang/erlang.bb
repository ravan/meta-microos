SUMMARY = "General-purpose programming language and runtime environment"
DESCRIPTION = "Erlang is a general-purpose programming language and runtime \
environment. Erlang has built-in support for concurrency, distribution \
and fault tolerance. Erlang is used in several large telecommunication \
systems from Ericsson."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "aa1b59b98a7e158f32e33dadb9f4c806e5456bab82b33c8932baed1368ae6899cc3183ff8e4581eb31372b9d65c657104df1a1ac4ea7a0970e35317d597e7f94"

RPROVIDES:${PN} += "erlang \
rpm-macro--erldir \
rpm-macro--erllibdir \
rpm-macro-erlang-app-name \
rpm-macro-erlang-app-vsn \
rpm-macro-erlang-dir \
rpm-macro-erlang-libdir"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang-epmd \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
