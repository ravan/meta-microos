SUMMARY = "Luabind Library"
DESCRIPTION = "Luabind is a library that helps you create bindings between C++ and Lua. \
It has the ability to expose functions and classes, written in C++, to Lua. \
This package contains the library."
LICENSE = "MIT"

PV = "0.9.1+git20150408.a0edf58"

RPM_NAME = "libluabind0_9_1-0.9.1+git20150408.a0edf58-4.4.aarch64.rpm"
RPM_HASH = "d957c7b9c0702b9aab49b50afc43cd04a5a7fa3ef0807857a5a670d5388f2c9d4ee4566657548c8eb12c75d0b24f9e1f687c742a740c2b1094c9e026fa363bdb"

RPROVIDES:${PN} += "libluabind.so.0.9.1 \
libluabind0-9-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.3.so.5 \
libstdc++.so.6"

inherit rpm
