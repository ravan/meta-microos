SUMMARY = "Happy is a parser generator for Haskell"
DESCRIPTION = "Happy is a parser generator for Haskell. Given a grammar specification in BNF, \
Happy generates Haskell code to parse the grammar. Happy works in a similar way \
to the 'yacc' tool for C."
LICENSE = "BSD-2-Clause"

PV = "2.1.7"

RPM_NAME = "happy-2.1.7-1.6.aarch64.rpm"
RPM_HASH = "8a011c3995abe55eaf4e08a2b43ea74d9935680ad0e8432ea494094109251e353b9c743f10bd282d0219baefb51581ba3ce7a2003badce0914971c3614ff5797"

RPROVIDES:${PN} += "happy"

RDEPENDS:${PN} += "ghc-happy-lib-templates \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
