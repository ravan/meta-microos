SUMMARY = "Haskell xml-conduit profiling library"
DESCRIPTION = "This package provides the Haskell xml-conduit profiling library."
LICENSE = "MIT"

PV = "1.10.1.0"

RPM_NAME = "ghc-xml-conduit-prof-1.10.1.0-2.3.aarch64.rpm"
RPM_HASH = "8def1f9618bd888be68cb42ca53b758504eac5524efb5422b8575a3f87cacc59256519a6e2ee7ed3a4531bd3c0e860abca512abf7e2eaab2d39d33ae4c05106f"

RPROVIDES:${PN} += "ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-xml-conduit-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-xml-conduit-devel"

inherit rpm
