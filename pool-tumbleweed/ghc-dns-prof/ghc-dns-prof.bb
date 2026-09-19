SUMMARY = "Haskell dns profiling library"
DESCRIPTION = "This package provides the Haskell dns profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "ghc-dns-prof-4.2.0-1.11.aarch64.rpm"
RPM_HASH = "824a368af591444cfd0712bfb0b3ac72a5ba6ef1fe33a05a2b80858db83ed8b9588fe2fd82a739c5fe4510782d1b811f1d51a0380f25711b5386db7caca81f69"

RPROVIDES:${PN} += "ghc-dns-prof \
ghc-prof-dns-4.2.0-1Jrjr9syZ5X5AjKTBjylRX"

RDEPENDS:${PN} += "ghc-dns-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu"

inherit rpm
