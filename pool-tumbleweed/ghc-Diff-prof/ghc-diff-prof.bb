SUMMARY = "Haskell Diff profiling library"
DESCRIPTION = "This package provides the Haskell Diff profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-Diff-prof-1.0.2-1.12.aarch64.rpm"
RPM_HASH = "fe66b4c47306dc78e2b2decda101e57256b07a49b2bd1c522b264ae559cef9dc5d721d5298e7124e27ae90d10a75fbe56b1d92c8bd18be7a09078e6f25a98857"

RPROVIDES:${PN} += "ghc-Diff-prof \
ghc-prof-Diff-1.0.2-5PTxq8P0tjM13opDjMQ0ap"

RDEPENDS:${PN} += "ghc-Diff-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-pretty-1.1.3.6-b7fd"

inherit rpm
