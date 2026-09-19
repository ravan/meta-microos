SUMMARY = "Basic types for representing XML"
DESCRIPTION = "Basic types for representing XML. \
 \
The idea is to have a full set of appropriate types, which various XML \
libraries can share. Instead of having equivalent-but-incompatible types for \
every binding, parser, or client, they all share the same types can can thus \
interoperate easily. \
 \
This library contains complete types for most parts of an XML document, \
including the prologue, node tree, and doctype. Some basic combinators are \
included for common tasks, including traversing the node tree and filtering \
children."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-0.3.8-4.23.aarch64.rpm"
RPM_HASH = "9c2d259baac97c02195af63c81475078e1e7b0a0e75ef91cc4b6c7285a1d20489a8423a8f956cd7a83a1393e4dd2bffcc563ea5d5d349c41beea014ca81f167a"

RPROVIDES:${PN} += "ghc-xml-types \
libHSxml-types-0.3.8-35OA2z37X8M4UCRyGooeYw-ghc9.12.4.so"

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
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
