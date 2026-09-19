SUMMARY = "Efficient buffered output"
DESCRIPTION = "This library allows to efficiently serialize Haskell values to lazy bytestrings \
with a large average chunk size. The large average chunk size allows to make \
good use of cache prefetching in later processing steps (e.g. \
compression) and reduces the system call overhead when writing the resulting \
lazy bytestring to a file or sending it over the network. \
 \
This library was inspired by the module Data.Binary.Builder provided by the \
binary package. It was originally developed with the specific needs of the \
blaze-html package in mind. Since then it has been restructured to serve as a \
drop-in replacement for Data.Binary.Builder, which it improves upon both in \
speed as well as expressivity."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.1"

RPM_NAME = "ghc-blaze-builder-0.4.4.1-1.9.aarch64.rpm"
RPM_HASH = "23a1c3a3b45f353d9287b6f3a7f6632998dd27f04b039c582b95843f95ada518c4f5cdee29119d84e9213042a7be1542a8484cd0025ef4388b0370518ff41958"

RPROVIDES:${PN} += "ghc-blaze-builder \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so"

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
