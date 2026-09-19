SUMMARY = "Haskell dns library development files"
DESCRIPTION = "This package provides the Haskell dns library development files."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "ghc-dns-devel-4.2.0-1.11.aarch64.rpm"
RPM_HASH = "b0cc631ae64e562d454ad2305240dff3e492a985e71a4acf6c471447d431affe48496c0c9e53955cac8cec25ba4b48cf2b175e62683bb6ffabb29d489067bd44"

RPROVIDES:${PN} += "ghc-devel-dns-4.2.0-1Jrjr9syZ5X5AjKTBjylRX \
ghc-dns-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o \
ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-dns"

inherit rpm
