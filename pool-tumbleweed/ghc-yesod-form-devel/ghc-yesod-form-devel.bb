SUMMARY = "Haskell yesod-form library development files"
DESCRIPTION = "This package provides the Haskell yesod-form library development files."
LICENSE = "MIT"

PV = "1.7.9.3"

RPM_NAME = "ghc-yesod-form-devel-1.7.9.3-1.6.aarch64.rpm"
RPM_HASH = "3e9ed775f833f89b84572c8e0580d1337a5b31d64b76f60b195748b614d4e4ba58e5c1fe1c11f76e77a87677f1506779ac8b195c4a1441913a30e1dff2dab522"

RPROVIDES:${PN} += "ghc-devel-yesod-form-1.7.9.3-Dz0p5U8sFJF52s5S4twsNq \
ghc-yesod-form-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-email-validate-2.3.2.21-Kzdyy7ay2BfLqW6NieUzU3 \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-xss-sanitize-0.3.7.2-zxNA19mSHN2TTh4wNg5nE \
ghc-devel-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-devel-yesod-persistent-1.6.0.9-HWNmgLBsD5B8eUWPPveJe \
ghc-yesod-form"

inherit rpm
