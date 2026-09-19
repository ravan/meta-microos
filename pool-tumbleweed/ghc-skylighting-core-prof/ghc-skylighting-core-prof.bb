SUMMARY = "Haskell skylighting-core profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.7"

RPM_NAME = "ghc-skylighting-core-prof-0.14.7-1.13.aarch64.rpm"
RPM_HASH = "f51a4d1305b3f30d5051ebd687ba091e12fbe8958483c9896ee16f6abaa6b65bc24bb918785e66e4115fff7f7284bb57edc4e61bddb6f40835fad6a7190bbe0b"

RPROVIDES:${PN} += "ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-skylighting-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-skylighting-core-devel"

inherit rpm
