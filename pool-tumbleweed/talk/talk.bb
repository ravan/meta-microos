SUMMARY = "Talk Client for Chatting with Another User"
DESCRIPTION = "This package contains the talk client, which allows you to chat with \
another user on a different system. Talk is a communication program \
which copies lines from one terminal to that of another user."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "talk-0.17-723.10.aarch64.rpm"
RPM_HASH = "3c2186089f2675534bfcdd42e359b5f33cd291d7538e2f268fe9283651de7f936b855f1dbf11623dfbe8528c561473d0a78444bcd15bd727879a2aab07a6b7a4"

RPROVIDES:${PN} += "nkitb-/usr/bin/talk \
talk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
