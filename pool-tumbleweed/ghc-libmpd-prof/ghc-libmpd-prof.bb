SUMMARY = "Haskell libmpd profiling library"
DESCRIPTION = "This package provides the Haskell libmpd profiling library."
LICENSE = "MIT"

PV = "0.10.0.1"

RPM_NAME = "ghc-libmpd-prof-0.10.0.1-1.25.aarch64.rpm"
RPM_HASH = "c00ae1d6bcc84fd9588ddb8c0a4e14f7225f6b35b2bccf4a5f948d8888eedac91a04e26a9b0209e89488608441dc7cf44cf11bfe5952f35411cdbb84e2b6496a"

RPROVIDES:${PN} += "ghc-libmpd-prof \
ghc-prof-libmpd-0.10.0.1-Bmz7H1YtWod2b1GpfQlz83"

RDEPENDS:${PN} += "ghc-libmpd-devel \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
