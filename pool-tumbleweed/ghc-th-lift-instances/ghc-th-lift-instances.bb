SUMMARY = "Lift instances for template-haskell for common data types"
DESCRIPTION = "Most data types in the haskell platform do not have Lift instances. \
This package provides orphan instances for containers, text, bytestring and \
vector. It also provides compat instances for older versions of \
'template-haskell' \
 \
Note that <https://hackage.haskell.org/package/th-lift th-lift> package \
provides Template Haskell based derivation of 'Lift' instances (when you cannot \
use 'DeriveLift' extension), and \
<https://hackage.haskell.org/package/th-orphans th-orphans> package provides \
instances for TH datatypes."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-0.1.20-2.36.aarch64.rpm"
RPM_HASH = "97bf15770495ec052da30d3d7601f595450f1154670a50bf5669c65c8b897813a45bd888dc7c4b7c80e1683d84d94bebeb1b2adb6cf2e0b2fa2a96d60c16c7f0"

RPROVIDES:${PN} += "ghc-th-lift-instances \
libHSth-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw-ghc9.12.4.so"

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
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
