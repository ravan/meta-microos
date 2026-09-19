SUMMARY = "Haskell libmpd library development files"
DESCRIPTION = "This package provides the Haskell libmpd library development files."
LICENSE = "MIT"

PV = "0.10.0.1"

RPM_NAME = "ghc-libmpd-devel-0.10.0.1-1.25.aarch64.rpm"
RPM_HASH = "5e2957763c589e99f95b211cb7e8fe10bdb26c486ee76ceddb2d14fd666f6f74fb79f5dd9934c2265a931c14655883bf67f89529c75711f1dcaf18787631f654"

RPROVIDES:${PN} += "ghc-devel-libmpd-0.10.0.1-Bmz7H1YtWod2b1GpfQlz83 \
ghc-libmpd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-libmpd"

inherit rpm
