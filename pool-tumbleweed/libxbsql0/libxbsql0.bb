SUMMARY = "Shared libraries for xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains shared libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "libxbsql0-0.11-261.9.aarch64.rpm"
RPM_HASH = "9fc1966ee935a3a0f9aac1a1a50938a5785493b8b95bc2f6b550277710f9edec002a80be22aae2f93d2df4e38831df3939cd8842cf0975f82626e0c15c38ee8f"

RPROVIDES:${PN} += "libxbsql.so.0 \
libxbsql0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxbase64.so.1"

inherit rpm
