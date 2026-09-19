SUMMARY = "Haskell ShellCheck profiling library"
DESCRIPTION = "This package provides the Haskell ShellCheck profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "ghc-ShellCheck-prof-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "0a5c28d24ab96d069feeb885111953372616273af32f51da0ecbed0be34433f2d136f519af6151ab49eac1db7f1ab6417ecc299a003416f7cd78c18bc8073aa0"

RPROVIDES:${PN} += "ghc-ShellCheck-prof \
ghc-prof-ShellCheck-0.11.0-9WjU3BJUXC1EFIs8EzczE8"

RDEPENDS:${PN} += "ghc-ShellCheck-devel \
ghc-prof-Diff-1.0.2-5PTxq8P0tjM13opDjMQ0ap \
ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-fgl-5.8.3.1-7WeyqbkdcX2Klu3tCAsWkr \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
