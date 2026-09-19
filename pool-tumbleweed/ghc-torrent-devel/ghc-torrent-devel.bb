SUMMARY = "Haskell torrent library development files"
DESCRIPTION = "This package provides the Haskell torrent library development files."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-devel-10000.1.3-1.32.aarch64.rpm"
RPM_HASH = "8bd84124d7e97275266cc3ea7ef6c4d94f0d3ed8fff4879555019478583d3a8658d4e5351dd612179b8d73d966f4a5a961cedf8256353fadd46ac0c8becdaea7"

RPROVIDES:${PN} += "ghc-devel-torrent-10000.1.3-FDBlXWeq8Eo78d8gddJr1A \
ghc-torrent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bencode-0.6.1.1-KWSVkFpNEL1HhwrIArSQND \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-torrent"

inherit rpm
