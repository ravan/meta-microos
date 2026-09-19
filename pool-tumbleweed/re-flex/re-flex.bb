SUMMARY = "C++ regex library and lexical analyzer generator with Unicode support"
DESCRIPTION = "A high-performance C++ regex library and lexical analyzer generator with \
Unicode support. Extends Flex++ with Unicode support, indent/dedent anchors, \
lazy quantifiers, functions for lex and syntax error reporting and more. \
Seamlessly integrates with Bison and other parsers."
LICENSE = "BSD-3-Clause"

PV = "6.4.0"

RPM_NAME = "re-flex-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "c2377218559e39181cac3a23fc991a6c90a9ab4622e9ff17c89d55d7428ea3db73bd4072717fe14d69d31768d549bb4ee49f1e41db7bed07610b801b595551bb"

RPROVIDES:${PN} += "re-flex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libreflex.so.6.4 \
libstdc++.so.6"

inherit rpm
