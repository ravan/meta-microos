SUMMARY = "Haskell brick library development files"
DESCRIPTION = "This package provides the Haskell brick library development files."
LICENSE = "BSD-3-Clause"

PV = "2.12"

RPM_NAME = "ghc-brick-devel-2.12-1.4.aarch64.rpm"
RPM_HASH = "d4a7ca6fa5fc45738f2855bf416f24a3ef4de7d51d3e9256dd4768289f5557113e1915a47d92029714ddbd0fa6c9645db8c384d0b45c7146776c1177b80cc8df"

RPROVIDES:${PN} += "ghc-brick-devel \
ghc-devel-brick-2.12-LgticZ12Zph9E2wGepOKBH"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-brick \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bimap-0.5.0-4NSO3lF4JlF9IWsrimrxRe \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-config-ini-0.2.7.0-7oGnb0uYOjJ1nTfrjTJt8v \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-clist-0.2-JcMjkvVz4h0BOKvHWv3aRs \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-devel-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-devel-vty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8 \
ghc-devel-word-wrap-0.5-FAfG7XDOqTwGSwy25x3Nlx"

inherit rpm
