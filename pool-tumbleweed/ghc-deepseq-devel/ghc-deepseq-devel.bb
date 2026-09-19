SUMMARY = "Haskell deepseq library development files"
DESCRIPTION = "This package provides the Haskell deepseq library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-deepseq-devel-1.5.1.0-1.3.aarch64.rpm"
RPM_HASH = "00034ac0af6f94587c8e42a82d80fc333c3fe5c0ae218a5b0deecb612d7b109ee69425b19d48bcb62ca41be245bb444a5137d38534c0734ac21acde61b702a0e"

RPROVIDES:${PN} += "ghc-deepseq-devel \
ghc-deepseq-static \
ghc-devel-deepseq-1.5.1.0-1350"

RDEPENDS:${PN} += "ghc-compiler \
ghc-deepseq \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c"

inherit rpm
