SUMMARY = "Haskell recv profiling library"
DESCRIPTION = "This package provides the Haskell recv profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-recv-prof-0.1.1-1.8.aarch64.rpm"
RPM_HASH = "4589dc4c5c20ee3f8c2b620d71c97a8674cd7090e55283b45055040976f3e89d326c8bff9cd637c3c6ccb5cbde4c103d9142474e980dfae327c540ec2e88227e"

RPROVIDES:${PN} += "ghc-prof-recv-0.1.1-9tN4UPJrbcvHykqBUpm2ul \
ghc-recv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-recv-devel"

inherit rpm
