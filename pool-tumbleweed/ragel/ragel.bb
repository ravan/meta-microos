SUMMARY = "Finite state machine compiler"
DESCRIPTION = "Ragel compiles finite state machines from regular languages into \
executable C, C++, Objective-C, or D code. Ragel state machines can \
not only recognize byte sequences as regular expression machines do, \
but can also execute code at arbitrary points in the recognition of a \
regular language. Code embedding is done using inline operators that \
do not disrupt the regular language syntax."
LICENSE = "MIT"

PV = "7.0.4"

RPM_NAME = "ragel-7.0.4-1.22.aarch64.rpm"
RPM_HASH = "9414fc3b5e843dd99a7ffc7639c0ed99a0c488fc221613d6b10da9deee5ead153045f44a25f30fbfc4d5b53c3b53ee21e9612e54a7f6e7aac63fb48a77688c12"

RPROVIDES:${PN} += "libragel.so.0 \
ragel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcolm-0.14.7.so \
libfsm-0.14.7.so \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
