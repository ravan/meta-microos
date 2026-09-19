SUMMARY = "Haskell crypto-token library development files"
DESCRIPTION = "This package provides the Haskell crypto-token library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "ghc-crypto-token-devel-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "3210afe343466de407d4d2598f18daeeb070a1689bba0099e8324407c24ac878484f1f072e145d90ac660686531e1e0d401e90634a3fea73f9c6c48e8ec64d82"

RPROVIDES:${PN} += "ghc-crypto-token-devel \
ghc-devel-crypto-token-0.2.0-DtnqWEKcimRLBs2fTpfiGj"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-token \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr"

inherit rpm
