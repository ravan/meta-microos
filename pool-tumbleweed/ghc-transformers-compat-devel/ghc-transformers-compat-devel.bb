SUMMARY = "Haskell transformers-compat library development files"
DESCRIPTION = "This package provides the Haskell transformers-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-devel-0.7.2-2.35.aarch64.rpm"
RPM_HASH = "fa235c32eaa1674e818074c68b39df1811da37118b1a4139b529622f862eea2c70ffc4c747d9d4f0bcee41cea2b305d31c628e8af3c50bad206798e50ea36045"

RPROVIDES:${PN} += "ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-transformers-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-transformers-compat"

inherit rpm
