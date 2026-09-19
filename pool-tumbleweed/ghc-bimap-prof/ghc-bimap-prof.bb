SUMMARY = "Haskell bimap profiling library"
DESCRIPTION = "This package provides the Haskell bimap profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-prof-0.5.0-2.23.aarch64.rpm"
RPM_HASH = "b9163adcf677c069de23b55622b22c4dcd21f4e2e105690efc27684b075227c6b0473f43200366132d371ad6118496550da56c6b16191a4b9009f789bcc9a402"

RPROVIDES:${PN} += "ghc-bimap-prof \
ghc-prof-bimap-0.5.0-4NSO3lF4JlF9IWsrimrxRe"

RDEPENDS:${PN} += "ghc-bimap-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655"

inherit rpm
