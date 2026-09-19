SUMMARY = "Nicer interface for reified information about data types"
DESCRIPTION = "This package normalizes variations in the interface for inspecting datatype \
information via Template Haskell so that packages and support a single, easier \
to use informational datatype while supporting many versions of Template \
Haskell."
LICENSE = "ISC"

PV = "0.7.2.0"

RPM_NAME = "ghc-th-abstraction-0.7.2.0-1.3.aarch64.rpm"
RPM_HASH = "9b53ce52fe964881dd731c010a1898616834caefc80b64902d9086035dd9675c14f7284b2055885396857d65f61b05d9d89552db68e0238746987b216e282041"

RPROVIDES:${PN} += "ghc-th-abstraction \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
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
