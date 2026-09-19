SUMMARY = "Text styling for ANSI terminals"
DESCRIPTION = "Text styling for ANSI terminals using SGR codes, as defined by the \
<https://www.ecma-international.org/publications-and-standards/standards/ecma-48 \
ECMA-48> standard. \
 \
Supports foreground/background color, bold/faint intensity, italic, \
single/double underline, strikethrough, frame, encircle, and overline escape \
sequences. Some styles may not work on your terminal. \
 \
Also features terminal detection, so redirecting styled output to a file will \
automatically strip the ANSI escape sequences."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-text-ansi-0.3.0.1-4.2.aarch64.rpm"
RPM_HASH = "ce9c58870985315604256d1c67ea25c161821d40cb8600e3a26c6e81957d71215bd123c2253d8776422968e1406e512f7b25a3ade08c56e8c60831d916da2109"

RPROVIDES:${PN} += "ghc-text-ansi \
libHStext-ansi-0.3.0.1-VLtME1OTfL3OjlqJPcyHR-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSquote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-builder-linear-0.1.3-2ecVyAm1DTtJbSvV9ASpSh-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
