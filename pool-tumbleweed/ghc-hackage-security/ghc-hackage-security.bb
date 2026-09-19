SUMMARY = "Hackage security library"
DESCRIPTION = "The hackage security library provides both server and client utilities for \
securing the Hackage package server (<https://hackage.haskell.org/>). \
It is based on The Update Framework (<https://theupdateframework.com/>), a set \
of recommendations developed by security researchers at various universities in \
the US as well as developers on the Tor project \
(<https://www.torproject.org/>). \
 \
The current implementation supports only index signing, thereby enabling \
untrusted mirrors. It does not yet provide facilities for author package \
signing. \
 \
The library has two main entry points: 'Hackage.Security.Client' is the main \
entry point for clients (the typical example being 'cabal'), and \
'Hackage.Security.Server' is the main entry point for servers (the typical \
example being 'hackage-server')."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.3"

RPM_NAME = "ghc-hackage-security-0.6.3.3-1.3.aarch64.rpm"
RPM_HASH = "c0bcddf1e9cb48ba650efec621c17a0f7d905507bfa0b48b30dabf1b2f41759ac26dc73b9c1ee52b248ade523f87908bfcd9463286a2f86509e096b588075004"

RPROVIDES:${PN} += "ghc-hackage-security \
libHShackage-security-0.6.3.3-Jje472K7snZBc2J1CzQQlY-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSCabal-syntax-3.14.2.0-5c2f-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSatomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSdirectory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9-ghc9.12.4.so \
libHSed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStar-0.6.4.0-6dSvxaDgGK790VblyYOhVA-tar-internal-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
