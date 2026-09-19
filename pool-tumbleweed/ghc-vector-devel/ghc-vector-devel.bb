SUMMARY = "Haskell vector library development files"
DESCRIPTION = "This package provides the Haskell vector library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.2.0"

RPM_NAME = "ghc-vector-devel-0.13.2.0-5.3.aarch64.rpm"
RPM_HASH = "568e00e2094e1fd984db9f9367359c8831a868c525777e3a438fbe89ad5d943ce7737128bcb17b81fba63bab1280aa8b7f88cb828bb76ce50cf4ebcb5e89c9b4"

RPROVIDES:${PN} += "ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-vector-0.13.2.0-JkxMTa2gLKkJke17YJOtM5-benchmarks-O2 \
ghc-vector-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-devel-vector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF \
ghc-vector"

inherit rpm
