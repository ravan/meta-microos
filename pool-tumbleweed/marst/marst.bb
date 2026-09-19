SUMMARY = "Algol-to-C translator"
DESCRIPTION = "MARST is an Algol-to-C translator. It automatically translates programs written \
on the algorithmic language Algol 60 to the C programming language."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "marst-2.8-1.5.aarch64.rpm"
RPM_HASH = "32f6a7dd3ca2f5241bcec2f3256b0923628b03d66f0cbb5a4f84ebceae6af4bd632f4d48850067335088c3d6e12c95322cde3555ab9b1325ca2103f5f052b47d"

RPROVIDES:${PN} += "marst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
