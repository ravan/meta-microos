SUMMARY = "UUID module for Qore"
DESCRIPTION = "This package contains the uuid module for the Qore Programming Language. \
 \
UUIDs are universally unique identifiers that can be used for any purpose."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-uuid-module-1.4.1-3.5.aarch64.rpm"
RPM_HASH = "bb9967d5c1dc47d5a83806abc92e5172ec964309ffe8afa17f5896181da2faeca8c8b2c01fd93760d4bf2a39eff005f1fd27a620f8edc614b14a0a85f30b8abd"

RPROVIDES:${PN} += "qore-uuid-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1 \
qore-module-abi"

inherit rpm
