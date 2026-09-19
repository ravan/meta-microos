SUMMARY = "POSIX-compliant Implementation of /bin/sh"
DESCRIPTION = "DASH is a POSIX-compliant implementation of /bin/sh that aims to be as small as \
possible without sacrificing speed where possible."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.5.13.4"

RPM_NAME = "dash-0.5.13.4-1.3.aarch64.rpm"
RPM_HASH = "85829f1d8a92debf40fc14e790e1fdfad7d964cbe2a41a47b7c9f1a07255d2293d9c46f1654f69081b702543620300e71e718a78df40e76653574bffb15b4c1a"

RPROVIDES:${PN} += "dash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0"

inherit rpm
