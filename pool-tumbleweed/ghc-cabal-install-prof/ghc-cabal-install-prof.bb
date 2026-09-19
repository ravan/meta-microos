SUMMARY = "Haskell cabal-install profiling library"
DESCRIPTION = "This package provides the Haskell cabal-install profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.1"

RPM_NAME = "ghc-cabal-install-prof-3.14.1.1-6.4.aarch64.rpm"
RPM_HASH = "30a89abe4e94fcdb51e6cc8aa640e82792ed2072ebb6659592ee964fa766069548e3802da1b129c84838e3e6890e2fa3d8313c218da8f1907139d9ed037804b4"

RPROVIDES:${PN} += "ghc-cabal-install-prof \
ghc-prof-cabal-install-3.14.1.1-86fnco0judQ4hSx15jfGDY"

RDEPENDS:${PN} += "ghc-cabal-install-devel \
ghc-prof-Cabal-3.14.2.0-f8f4 \
ghc-prof-Cabal-syntax-3.14.2.0-5c2f \
ghc-prof-HTTP-4000.4.1-G8VuDcYxUIH9Vk3NDIhhHx \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cabal-install-solver-3.14.1.0-FwXkmWLb7x8K0OTcy9OfwR \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-echo-0.1.4-2JVioXINDaCEoYt7R5FuJ9 \
ghc-prof-edit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hackage-security-0.6.3.3-Jje472K7snZBc2J1CzQQlY \
ghc-prof-lukko-0.1.2-KyYOwE0CZU8A6c79eyT2Xk \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-open-browser-0.4.0.0-7biGibAfoQqCCBDffMcbRg \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-prof-regex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS \
ghc-prof-resolv-0.2.0.3-2a3UXbRQZR0IVSb1MrCNb4 \
ghc-prof-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-prof-semaphore-compat-1.0.0-cc95 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU"

inherit rpm
