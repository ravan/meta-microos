SUMMARY = "Haskell word-wrap profiling library"
DESCRIPTION = "This package provides the Haskell word-wrap profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-prof-0.5-2.19.aarch64.rpm"
RPM_HASH = "126ad9863341b4f20d6679e3f141c507c61fe49631c6ead3ebf9e744481327345a23e172d7a40a21217a171d11895280b03084f7091bda8285e9f1b3e79b4095"

RPROVIDES:${PN} += "ghc-prof-word-wrap-0.5-FAfG7XDOqTwGSwy25x3Nlx \
ghc-word-wrap-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-text-2.1.4-cf23 \
ghc-word-wrap-devel"

inherit rpm
