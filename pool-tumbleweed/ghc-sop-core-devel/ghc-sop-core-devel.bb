SUMMARY = "Haskell sop-core library development files"
DESCRIPTION = "This package provides the Haskell sop-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-devel-0.5.0.2-8.3.aarch64.rpm"
RPM_HASH = "263208c9782b6d1e9c9b361d01178cc82ff9b41ba5cf647cb4ac815a31e8ad95c660a4f5bf1caea8c643fdd9f593e286cf8b2a3156fa136fd0e30b4fa7a6acb6"

RPROVIDES:${PN} += "ghc-devel-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-sop-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-sop-core"

inherit rpm
