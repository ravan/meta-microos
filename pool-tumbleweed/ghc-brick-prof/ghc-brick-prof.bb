SUMMARY = "Haskell brick profiling library"
DESCRIPTION = "This package provides the Haskell brick profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.12"

RPM_NAME = "ghc-brick-prof-2.12-1.4.aarch64.rpm"
RPM_HASH = "2db5ef31bd1484ef0e7a2db0057f9834ea614d0d7ac91dd819cfa3ae33eb54604617c5b1cd6661368c9b38bb75dbb3917b5f6030c77acd7746bc0e4d658edf21"

RPROVIDES:${PN} += "ghc-brick-prof \
ghc-prof-brick-2.12-LgticZ12Zph9E2wGepOKBH"

RDEPENDS:${PN} += "ghc-brick-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bimap-0.5.0-4NSO3lF4JlF9IWsrimrxRe \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-config-ini-0.2.7.0-7oGnb0uYOjJ1nTfrjTJt8v \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-clist-0.2-JcMjkvVz4h0BOKvHWv3aRs \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-prof-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-prof-vty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8 \
ghc-prof-word-wrap-0.5-FAfG7XDOqTwGSwy25x3Nlx"

inherit rpm
