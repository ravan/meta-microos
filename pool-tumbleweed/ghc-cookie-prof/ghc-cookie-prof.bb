SUMMARY = "Haskell cookie profiling library"
DESCRIPTION = "This package provides the Haskell cookie profiling library."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "ghc-cookie-prof-0.5.1-1.12.aarch64.rpm"
RPM_HASH = "4aac4879e28d3766114136844300faf75970c61508e412bc9dfa2d09e762c067d4fcdc8bd64e6c5c5c10e6bde1b82072765a6db3701c1d61461eb2faddc20037"

RPROVIDES:${PN} += "ghc-cookie-prof \
ghc-prof-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft"

RDEPENDS:${PN} += "ghc-cookie-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc"

inherit rpm
