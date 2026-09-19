SUMMARY = "Haskell uuid profiling library"
DESCRIPTION = "This package provides the Haskell uuid profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.16.1"

RPM_NAME = "ghc-uuid-prof-1.3.16.1-1.2.aarch64.rpm"
RPM_HASH = "83f9997bebc47d28d1015721c599ca95781a7d102ddda31c67178dca43ced5a56c233ad3239908f1764cd1f3a70b34d7c08c78816dd91cffd56430c2f90c4f28"

RPROVIDES:${PN} += "ghc-prof-uuid-1.3.16.1-JPvbmr4TLlEERTSybCyfOm \
ghc-uuid-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS \
ghc-prof-cryptohash-sha1-0.11.101.0-8eRxmtRH1AP4nYxJeWtthM \
ghc-prof-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-prof-network-info-0.2.1-I1lcnyergC0DdfN7xa3e0a \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-time-1.14-a7dc \
ghc-prof-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-uuid-devel"

inherit rpm
