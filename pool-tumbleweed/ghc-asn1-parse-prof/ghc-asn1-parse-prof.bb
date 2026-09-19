SUMMARY = "Haskell asn1-parse profiling library"
DESCRIPTION = "This package provides the Haskell asn1-parse profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-prof-0.9.5-6.24.aarch64.rpm"
RPM_HASH = "b58dd66d934fe44fe5fd1d74132cc75eb7b1225c4aeb3798aa14c35f4f91c40d564c865bb775632e8bb1aafcbdfc91a0c6272b946735884db75aa24072147412"

RPROVIDES:${PN} += "ghc-asn1-parse-prof \
ghc-prof-asn1-parse-0.9.5-C3ZcAfeR9k34dM4BWjZOjb"

RDEPENDS:${PN} += "ghc-asn1-parse-devel \
ghc-prof-asn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI \
ghc-prof-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
