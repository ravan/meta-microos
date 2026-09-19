SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-2.0-only"

PV = "9.0.21"

RPM_NAME = "seafile-9.0.21-1.1.aarch64.rpm"
RPM_HASH = "d8b504d60ce7a1a949024ad8e20b1960f833afd0f47a070685894ed3776e5da3d1a154f07a4c13af549d49e26a371cbfbac8d2d179614db6066eb379014757aa"

RPROVIDES:${PN} += "seafile"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libsearpc.so.1 \
libsqlite3.so.0 \
libssl.so.3 \
libuuid.so.1 \
libwebsockets.so.22 \
libz.so.1 \
python-abi"

inherit rpm
