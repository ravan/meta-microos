SUMMARY = "Discord RPC library"
DESCRIPTION = "This is a library for interfacing your game with a locally running Discord \
desktop client."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "libdiscord-rpc3_4_0-3.4.0-3.14.aarch64.rpm"
RPM_HASH = "cf387571d5acda72f11bf6eacd9a31b4f4168a207353f28cf81eb5dc3cfe2f3210fd71ea4a869fc5b4e06940e4661bf8be092b9785435f1aeec7c917ea14774e"

RPROVIDES:${PN} += "libdiscord-rpc.so.3.4.0 \
libdiscord-rpc3-4-0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
