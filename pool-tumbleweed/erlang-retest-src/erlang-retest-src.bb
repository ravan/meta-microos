SUMMARY = "Erlang retest library"
DESCRIPTION = "Erlang retest library."
LICENSE = "MIT"

PV = "1.1.1+git20160312.ffef7d0"

RPM_NAME = "erlang-retest-src-1.1.1+git20160312.ffef7d0-2.11.aarch64.rpm"
RPM_HASH = "d595bf1ad3e804ea90b3ee7c072f3be44abce0b9ca5cf554fc1223e9c3b2b11e2b46a319a9704e347b2ea6a74fb1cb2ebc0f2ce8d9207eda777967d986a3a042"

RPROVIDES:${PN} += "erlang-retest-src"

RDEPENDS:${PN} += "erlang-retest"

inherit rpm
