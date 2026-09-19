SUMMARY = "Haskell base16-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base16-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-prof-1.0.2.0-3.21.aarch64.rpm"
RPM_HASH = "598c5c189a4b31584433fa3be3164b344a86f2998c5fe7f9a485770c036b72ecc0d95ac93191d86a51e336ba5570893482ca19567853006fb4b004038daaaca3"

RPROVIDES:${PN} += "ghc-base16-bytestring-prof \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL"

RDEPENDS:${PN} += "ghc-base16-bytestring-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
