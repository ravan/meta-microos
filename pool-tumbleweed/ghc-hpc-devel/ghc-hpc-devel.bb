SUMMARY = "Haskell hpc library development files"
DESCRIPTION = "This package provides the Haskell hpc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.0.2"

RPM_NAME = "ghc-hpc-devel-0.7.0.2-1.3.aarch64.rpm"
RPM_HASH = "04b00e1904d538775a70f0dfe05db35a29d9399662f851bc99aee975fc815e5fe889e4e3969e27fff64a0d5bd77958f4d9a73be9f16f67b53a1ca24d8af08f4a"

RPROVIDES:${PN} += "ghc-devel-hpc-0.7.0.2-1e89 \
ghc-hpc-devel \
ghc-hpc-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-time-1.14-a7dc \
ghc-hpc"

inherit rpm
