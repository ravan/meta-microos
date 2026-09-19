SUMMARY = "Haskell th-lift-instances library development files"
DESCRIPTION = "This package provides the Haskell th-lift-instances library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-devel-0.1.20-2.36.aarch64.rpm"
RPM_HASH = "70dd35e36f4fd8e6ef4172a7efb3432deba011e0819a176ed4459ab612dc1c7ceb6f81090eaa05fde7f58c9f50eda62cfdf7f302e08994b37b637d7ce88b8ac5"

RPROVIDES:${PN} += "ghc-devel-th-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw \
ghc-th-lift-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-th-lift-instances"

inherit rpm
