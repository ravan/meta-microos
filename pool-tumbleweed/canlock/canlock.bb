SUMMARY = "Utilities for creating and verifying Usenet cancel locks"
DESCRIPTION = "Cancel locks are used by Usenet article posters to authenticate their \
authorship of an article. It may then by used by servers to prevent \
cancel and supersede abuse. The use of this feature remains the \
newsmaster's decision. \
 \
This package contains a simple utility wrapping the canlock library, \
which may be used for both the generation and the verification of \
cancel locks, along with a message header parser and a header field \
parser."
LICENSE = "MIT & NLPL"

PV = "3.3.3"

RPM_NAME = "canlock-3.3.3-1.2.aarch64.rpm"
RPM_HASH = "902e8da70772fde9a95d38a3d7af017ee8da4fb9ddccfa0184696110dcad19bb4f333d82a953cb9236fca5a52b5b501edbcddc9652efd4bb13968723fea43a15"

RPROVIDES:${PN} += "canlock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanlock.so.3"

inherit rpm
