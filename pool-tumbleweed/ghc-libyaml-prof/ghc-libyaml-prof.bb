SUMMARY = "Haskell libyaml profiling library"
DESCRIPTION = "This package provides the Haskell libyaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-libyaml-prof-0.1.4-2.27.aarch64.rpm"
RPM_HASH = "05782d909e75277b8822766c6234bf6fb5580e76c76d4b0aeb536d80a89a490d0339d1704a663fd57ea67f0ed889be56e2e96c59f8b422a41103c7f41743285b"

RPROVIDES:${PN} += "ghc-libyaml-prof \
ghc-prof-libyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s"

RDEPENDS:${PN} += "ghc-libyaml-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE"

inherit rpm
