SUMMARY = "Haskell open-browser library development files"
DESCRIPTION = "This package provides the Haskell open-browser library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-open-browser-devel-0.4.0.0-1.6.aarch64.rpm"
RPM_HASH = "ba828d12dd866a58b0327189461abd08085b44423ceefc62718c70e5592743a7c520319a62dc81ba9bb1017d145a9d6285f9a704ae8be6cd39c18d99a12fc2b5"

RPROVIDES:${PN} += "ghc-devel-open-browser-0.4.0.0-7biGibAfoQqCCBDffMcbRg \
ghc-open-browser-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-process-1.6.26.1-905d \
ghc-open-browser"

inherit rpm
