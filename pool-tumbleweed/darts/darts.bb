SUMMARY = "Double Array Trie System"
DESCRIPTION = "Darts is a simple C++ template library to construct \
Double-Arrays [Aoe 1989]. Double-Arrays are data \
structures to represent Trie. These are faster than \
other Trie implementations. \
 \
Darts is used by Chasen."
LICENSE = "LGPL-2.1+"

PV = "0.32"

RPM_NAME = "darts-0.32-8.37.aarch64.rpm"
RPM_HASH = "b2ce2a235abe0f8476258a42dcdaca3f4edec62ab30c776a2d2a971a1ff35faa847423dbb0b4a79798c8dad4dc5617ffeece726c9516b6ef528d2587da18fc43"

RPROVIDES:${PN} += "darts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
