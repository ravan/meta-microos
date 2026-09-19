SUMMARY = "Haskell haskell-src-exts library documentation"
DESCRIPTION = "This package provides the Haskell haskell-src-exts library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.23.1"

RPM_NAME = "ghc-haskell-src-exts-doc-1.23.1-1.14.noarch.rpm"
RPM_HASH = "fb435971037b0ec2b42dc0d34b55bba410cf7e90807b1d2dc15ac570eadb343b1e99f2ea694d8bbda40b95658e182d5568eef5e6cf6e5a7c3482ba7d465fd5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskell-src-exts-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
