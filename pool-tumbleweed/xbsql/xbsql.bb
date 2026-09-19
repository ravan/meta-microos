SUMMARY = "SQL Wrapper for the XBase Library"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "xbsql-0.11-261.9.aarch64.rpm"
RPM_HASH = "93f8b510ba1bb0f4e0cd86db1e4021a3afb4e08c19392252e15ce91f26983b3db3b359a6089482897e8a46652e3ed4c46071e755a0cc36ac1b3fbfc2517420d7"

RPROVIDES:${PN} += "xbsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6 \
libxbsql.so.0"

inherit rpm
