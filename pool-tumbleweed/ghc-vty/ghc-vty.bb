SUMMARY = "A simple terminal UI library"
DESCRIPTION = "Vty is terminal GUI library in the niche of ncurses. It is intended to be easy \
to use and to provide good support for common terminal types. \
 \
See the example programs in the 'vty-crossplatform' package examples on how to \
use the library. \
 \
&#169; 2006-2007 Stefan O'Rear; BSD3 license. \
 \
&#169; Corey O'Connor; BSD3 license. \
 \
&#169; Jonathan Daugherty; BSD3 license."
LICENSE = "BSD-3-Clause"

PV = "6.6"

RPM_NAME = "ghc-vty-6.6-1.3.aarch64.rpm"
RPM_HASH = "a7db5ce13927d4a21f3c7ce331539cc1bea744ec2e4500174a5d55533e5b6900d2ed716d6f22037e3e30daf4e93cd3e8a9f48fe7827e94014603cdb1dc54b40a"

RPROVIDES:${PN} += "ghc-vty \
libHSvty-6.6-EPyV4ZsVRx8EnXBLhcE4eO-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSblaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmicrolens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3-ghc9.12.4.so \
libHSmicrolens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
