SUMMARY = "A binary serialisation library for Haskell values"
DESCRIPTION = "This package (formerly 'binary-serialise-cbor') provides pure, efficient \
serialization of Haskell values directly into 'ByteString's for storage or \
transmission purposes. By providing a set of type class instances, you can also \
serialise any custom data type you have as well. \
 \
The underlying binary format used is the 'Concise Binary Object \
Representation', or CBOR, specified in RFC 7049. As a result, serialised \
Haskell values have implicit structure outside of the Haskell program itself, \
meaning they can be inspected or analyzed without custom tools. \
 \
An implementation of the standard bijection between CBOR and JSON is provided \
by the [cborg-json](/package/cborg-json) package. Also see \
[cbor-tool](/package/cbor-tool) for a convenient command-line utility for \
working with CBOR data."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.1"

RPM_NAME = "ghc-serialise-0.2.6.1-5.15.aarch64.rpm"
RPM_HASH = "a2d19003c5b483b442be1865bb7cb7efcfcc77362077bf8fde30c444df00976b887b79e29785ec4f6d29b9aff2c3268835a0acea183827e8d52ebd2306813a38"

RPROVIDES:${PN} += "ghc-serialise \
libHSserialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShalf-0.3.3-7uW8H7RguCn8iNkagLajaD-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHSstrict-0.5.1-9s5NAvHzvkrI18NRIQgFhz-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
