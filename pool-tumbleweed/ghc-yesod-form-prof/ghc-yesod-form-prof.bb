SUMMARY = "Haskell yesod-form profiling library"
DESCRIPTION = "This package provides the Haskell yesod-form profiling library."
LICENSE = "MIT"

PV = "1.7.9.3"

RPM_NAME = "ghc-yesod-form-prof-1.7.9.3-1.6.aarch64.rpm"
RPM_HASH = "df3eeaa6255e1773c7de20f6a818a70880c8129399e0b1cf110bab2cce18056efb4dfeb968fdda63ba880642a8d40961238097976a96d12203c6a8cbf1ce950c"

RPROVIDES:${PN} += "ghc-prof-yesod-form-1.7.9.3-Dz0p5U8sFJF52s5S4twsNq \
ghc-yesod-form-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-email-validate-2.3.2.21-Kzdyy7ay2BfLqW6NieUzU3 \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-xss-sanitize-0.3.7.2-zxNA19mSHN2TTh4wNg5nE \
ghc-prof-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-prof-yesod-persistent-1.6.0.9-HWNmgLBsD5B8eUWPPveJe \
ghc-yesod-form-devel"

inherit rpm
