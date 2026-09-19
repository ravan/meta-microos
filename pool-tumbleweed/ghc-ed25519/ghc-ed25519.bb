SUMMARY = "Ed25519 cryptographic signatures"
DESCRIPTION = "This package provides a simple, fast, self-contained copy of the Ed25519 \
public-key signature system with a clean interface. It also includes support \
for detached signatures, and thorough documentation on the design and \
implementation, including usage guidelines."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-0.0.5.0-18.14.aarch64.rpm"
RPM_HASH = "102f4d0a8479d2d34b7265c92a92b349516669529f435c41a3b535ce3f93508c05e8f66b96289f8f2bb9d6733182f9e7367f39cf0d00c6f1f0d4d2ebf2eb93f5"

RPROVIDES:${PN} += "ghc-ed25519 \
libHSed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
