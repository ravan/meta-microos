SUMMARY = "Privacy Enhanced Mail (PEM) format reader and writer"
DESCRIPTION = "Privacy Enhanced Mail (PEM) format reader and writer."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-0.2.4-8.31.aarch64.rpm"
RPM_HASH = "6ccff77b4b1e88986a4bcd9ebc901e137f9385e4fb74706e664bb80837c8660765e4f66b870d8d960bdb1801137cb53c86d89808a405737373bc82fe647dabb0"

RPROVIDES:${PN} += "ghc-pem \
libHSpem-0.2.4-HqB1KmdaogjHqJ1PBuavhl-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmemory-0.18.0-4OCVGiXkS6t9StTfiwlZlu-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
