SUMMARY = "Haskell control-monad-free library development files"
DESCRIPTION = "This package provides the Haskell control-monad-free library development \
files."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-devel-0.6.2-4.35.aarch64.rpm"
RPM_HASH = "daee18564568385a685ccfaa906186a2ce7b066016e62ebab7263b0be867a361b1d9badc35b7e97e187edad04be0d80efba0a43af6e9c33af399a09469ca9fe5"

RPROVIDES:${PN} += "ghc-control-monad-free-devel \
ghc-devel-control-monad-free-0.6.2-INrHbxo4qSqC5LftAQgJHR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-control-monad-free \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
