SUMMARY = "Haskell crypton-asn1-parse profiling library"
DESCRIPTION = "This package provides the Haskell crypton-asn1-parse profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "ghc-crypton-asn1-parse-prof-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "844b8475b8a2a4b81b55bf25f7fc99c5053aa0c55788c7fb25c517b85c47e313b2d87fc5bfc241b85994aaada4e947499455586e20d743df4117d30ad7e59eb1"

RPROVIDES:${PN} += "ghc-crypton-asn1-parse-prof \
ghc-prof-crypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ"

RDEPENDS:${PN} += "ghc-crypton-asn1-parse-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB"

inherit rpm
