SUMMARY = "General-purpose programming language and runtime environment"
DESCRIPTION = "Erlang is a general-purpose programming language and runtime \
environment. Erlang has built-in support for concurrency, distribution \
and fault tolerance. Erlang is used in several large telecommunication \
systems from Ericsson."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "baad93da1bfe2e650e4048bb3d4e77fc1ed4476cf0fffbebb4574ef96d0fe347ac6373bd5d7c338053584fd47d368527940b7d0affd18c2a906c52f0836f32d4"

RPROVIDES:${PN} += "erlang \
erlang27 \
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
