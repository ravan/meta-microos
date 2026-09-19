SUMMARY = "Haskell cabal-install library"
DESCRIPTION = "This package provides the Haskell cabal-install shared library."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.1"

RPM_NAME = "ghc-cabal-install-3.14.1.1-6.4.aarch64.rpm"
RPM_HASH = "62269d951b870395d7c2e1dc5ae2cb2a7b4ce66b8402fdea9cc63e3b41105dc7bc82164d92a008238299724aa43f1c9c5149e4205ab0f9c406d65f746ece69ef"

RPROVIDES:${PN} += "ghc-cabal-install \
libHScabal-install-3.14.1.1-86fnco0judQ4hSx15jfGDY-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSCabal-3.14.2.0-f8f4-ghc9.12.4.so \
libHSCabal-syntax-3.14.2.0-5c2f-ghc9.12.4.so \
libHSHTTP-4000.4.1-G8VuDcYxUIH9Vk3NDIhhHx-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSasync-2.2.6-4fW0sXrepSt4QxgAnnLVB6-ghc9.12.4.so \
libHSatomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScabal-install-solver-3.14.1.0-FwXkmWLb7x8K0OTcy9OfwR-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdirectory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9-ghc9.12.4.so \
libHSecho-0.1.4-2JVioXINDaCEoYt7R5FuJ9-ghc9.12.4.so \
libHSed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY-ghc9.12.4.so \
libHSedit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShackage-security-0.6.3.3-Jje472K7snZBc2J1CzQQlY-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSlukko-0.1.2-KyYOwE0CZU8A6c79eyT2Xk-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSopen-browser-0.4.0.0-7biGibAfoQqCCBDffMcbRg-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so \
libHSregex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS-ghc9.12.4.so \
libHSresolv-0.2.0.3-2a3UXbRQZR0IVSb1MrCNb4-ghc9.12.4.so \
libHSsafe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS-ghc9.12.4.so \
libHSsemaphore-compat-1.0.0-cc95-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStar-0.6.4.0-6dSvxaDgGK790VblyYOhVA-tar-internal-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
