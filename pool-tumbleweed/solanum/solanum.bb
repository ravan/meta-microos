SUMMARY = "Scalable IRCv3.2 compliant chat daemon"
DESCRIPTION = "Solanum is an IRCv3.2 compatible chat server. It is a continuation of the \
Charybdis server and has good documentation and ease of configuration. \
It is used by Libera, the largest (as of 2023) IRC network in the world."
LICENSE = "GPL-2.0-or-later"

PV = "0~ch670"

RPM_NAME = "solanum-0~ch670-1.5.aarch64.rpm"
RPM_HASH = "898d1ebce20d7ae4b74e721e4b7c0c11e0c8df33bb9cdb21dd6c664fbe828a6d5d8bc2d574cb62f8208ffe5d4f725fbeb425f7effec3775393a9aa7295d40814"

RPROVIDES:${PN} += "config-solanum \
group-solanum \
libircd.so \
librb.so \
solanum \
user-solanum"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libltdl.so.7 \
libsqlite3.so.0 \
libssl.so.3 \
sysuser-shadow"

inherit rpm
