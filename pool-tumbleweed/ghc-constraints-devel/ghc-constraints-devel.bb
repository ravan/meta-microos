SUMMARY = "Haskell constraints library development files"
DESCRIPTION = "This package provides the Haskell constraints library development files."
LICENSE = "BSD-2-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-constraints-devel-0.14.4-1.3.aarch64.rpm"
RPM_HASH = "8b78a4f4dc7614c84f881ba826583fa5dae4730456b941dedc8374c5d8f8e28e48dde3fcb9fc6d32654e415764584d00573cda3e0eb9969e6a0d54b8814e159c"

RPROVIDES:${PN} += "ghc-constraints-devel \
ghc-devel-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-constraints \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
