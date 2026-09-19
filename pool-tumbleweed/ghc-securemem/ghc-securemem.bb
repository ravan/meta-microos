SUMMARY = "Abstraction to an auto scrubbing and const time eq, memory chunk"
DESCRIPTION = "SecureMem is similar to ByteString, except that it provides a memory chunk that \
will be auto-scrubbed after it run out of scope."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-0.1.10-4.25.aarch64.rpm"
RPM_HASH = "b49f96738941c6f32323dfab151828d0b5dfefcb3e114856f5203068e66665db1fb73aa417241492d317b1560582b87500d550908929f7e76d4d982017cb4930"

RPROVIDES:${PN} += "ghc-securemem \
libHSsecuremem-0.1.10-3X8hOwUdNWpLbNN8DRIHnH-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
libHSbyteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo-ghc9.12.4.so \
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
