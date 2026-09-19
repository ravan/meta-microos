SUMMARY = "Haskell base-compat profiling library"
DESCRIPTION = "This package provides the Haskell base-compat profiling library."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "ghc-base-compat-prof-0.14.1-1.15.aarch64.rpm"
RPM_HASH = "57565e07c95e0dbdcd78f0a7b64b68f151c43335f0db8c752161a3fa4f73776a0d4fc85d720e61db6512cef1769b07c6a24919666f8fe779c48aea1e8e591268"

RPROVIDES:${PN} += "ghc-base-compat-prof \
ghc-prof-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy"

RDEPENDS:${PN} += "ghc-base-compat-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
