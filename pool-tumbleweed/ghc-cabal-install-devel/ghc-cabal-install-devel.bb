SUMMARY = "Haskell cabal-install library development files"
DESCRIPTION = "This package provides the Haskell cabal-install library development files."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.1"

RPM_NAME = "ghc-cabal-install-devel-3.14.1.1-6.4.aarch64.rpm"
RPM_HASH = "d0bf9a87fe3ff7f5827915c05682f36426619f10b736ed5805da82bce880f4fb6c9567be7f204da9520625c2264777c39964904ab36ccd514fd8f9af809ef972"

RPROVIDES:${PN} += "ghc-cabal-install-devel \
ghc-devel-cabal-install-3.14.1.1-86fnco0judQ4hSx15jfGDY"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-install \
ghc-compiler \
ghc-devel-Cabal-3.14.2.0-f8f4 \
ghc-devel-Cabal-syntax-3.14.2.0-5c2f \
ghc-devel-HTTP-4000.4.1-G8VuDcYxUIH9Vk3NDIhhHx \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cabal-install-solver-3.14.1.0-FwXkmWLb7x8K0OTcy9OfwR \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-echo-0.1.4-2JVioXINDaCEoYt7R5FuJ9 \
ghc-devel-edit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hackage-security-0.6.3.3-Jje472K7snZBc2J1CzQQlY \
ghc-devel-lukko-0.1.2-KyYOwE0CZU8A6c79eyT2Xk \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-open-browser-0.4.0.0-7biGibAfoQqCCBDffMcbRg \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-devel-regex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS \
ghc-devel-resolv-0.2.0.3-2a3UXbRQZR0IVSb1MrCNb4 \
ghc-devel-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-devel-semaphore-compat-1.0.0-cc95 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-tar-0.6.4.0-9ossRFyAR7eA6S8nUFxzyG \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU"

inherit rpm
