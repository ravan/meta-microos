SUMMARY = "Haskell crypto-pubkey-types profiling library"
DESCRIPTION = "This package provides the Haskell crypto-pubkey-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-crypto-pubkey-types-prof-0.4.3-1.25.aarch64.rpm"
RPM_HASH = "89cd9c8e05204e519b7998ce6344c34698729230c02705e4e9ffab8f92e8dab7d6f515ed275e7a86dbe1d557324c8a6355e6881e9d0b3867db5a0348d5e85208"

RPROVIDES:${PN} += "ghc-crypto-pubkey-types-prof \
ghc-prof-crypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t"

RDEPENDS:${PN} += "ghc-crypto-pubkey-types-devel \
ghc-prof-asn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI \
ghc-prof-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
