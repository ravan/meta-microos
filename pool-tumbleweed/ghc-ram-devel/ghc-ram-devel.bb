SUMMARY = "Haskell ram library development files"
DESCRIPTION = "This package provides the Haskell ram library development files."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "ghc-ram-devel-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "5616a9901ada4addb581ef5201a22a3408ab46af748f3eb9c0fcb633cf412cd4f7147afe4278dac3af0196f065e27d1dbbd085338a3626842027d603fee9fc0f"

RPROVIDES:${PN} += "ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-ram-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-ram"

inherit rpm
