SUMMARY = "The Fhourstones Benchmark"
DESCRIPTION = "This integer benchmark solves positions in the game of connect-4, as played \
on a vertical 7x6 board."
LICENSE = "BSD-2-Clause"

PV = "3.1+git.20150122"

RPM_NAME = "fhourstones-3.1+git.20150122-2.19.aarch64.rpm"
RPM_HASH = "b242cd25364f5e3e1fbe1e2ac19973d6db062cd75e85c61c28a857fceab5681a858d1434decdb6d39cc031b5e1ee66309eeba6964bdd60c79e9d3aa6a35431bb"

RPROVIDES:${PN} += "fhourstones"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
