SUMMARY = "ANSI terminal backend for the »prettyprinter« package"
DESCRIPTION = "ANSI terminal backend for the »prettyprinter« package."
LICENSE = "BSD-2-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "55b52dc35d437b486ddbcaf68c9ffed9a138b29daec04aeab01ca0891c80be3e34630bae4b713039bc7ed418b17b714a3f2f58d29b2712f13cdb63af695fef5d"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal \
libHSprettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ-ghc9.12.4.so \
libHSansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScolour-2.3.7-LuxtbazHK7IK55ldBice4c-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
