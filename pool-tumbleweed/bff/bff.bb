SUMMARY = "Moderately-optimizing Brainfuck interpreter"
DESCRIPTION = "Moderately-optimizing (tm) Brainfuck interpreter"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "bff-1.0.7-1.12.aarch64.rpm"
RPM_HASH = "c32e618bec288bc87bfdb37c416e04ae5cbd7310d2c605b0366b7b8a311eb47fe0d200867a2e5373627bda8b9fe18135cc779b1548b735de523fe6926385d315"

RPROVIDES:${PN} += "bff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
