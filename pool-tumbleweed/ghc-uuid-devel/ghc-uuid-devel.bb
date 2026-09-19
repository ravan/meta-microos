SUMMARY = "Haskell uuid library development files"
DESCRIPTION = "This package provides the Haskell uuid library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.16.1"

RPM_NAME = "ghc-uuid-devel-1.3.16.1-1.2.aarch64.rpm"
RPM_HASH = "05db06af4f4fbc99ceadb6ca49d8e6b7fa7a6b022a29af6f79f79b46a24a75a23299c30a6283c7808f79b31a648383943c9b3aef4da5d19b92474d7b65cafc80"

RPROVIDES:${PN} += "ghc-devel-uuid-1.3.16.1-JPvbmr4TLlEERTSybCyfOm \
ghc-uuid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS \
ghc-devel-cryptohash-sha1-0.11.101.0-8eRxmtRH1AP4nYxJeWtthM \
ghc-devel-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-devel-network-info-0.2.1-I1lcnyergC0DdfN7xa3e0a \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-time-1.14-a7dc \
ghc-devel-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-uuid"

inherit rpm
