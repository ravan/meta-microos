SUMMARY = "Haskell xml-conduit library development files"
DESCRIPTION = "This package provides the Haskell xml-conduit library development files."
LICENSE = "MIT"

PV = "1.10.1.0"

RPM_NAME = "ghc-xml-conduit-devel-1.10.1.0-2.3.aarch64.rpm"
RPM_HASH = "3edb040a28fd352f39a664d346ece5a935d0d1dbb731eb7cbe4accb9e29aa05ddcf89077bd2ecaff5bd451c8d370a12cd68a4db0410fb8671e127b2ddd2d72eb"

RPROVIDES:${PN} += "ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-xml-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-xml-conduit"

inherit rpm
