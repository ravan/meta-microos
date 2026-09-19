SUMMARY = "Haskell cryptohash-md5 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-devel-0.11.101.0-8.15.aarch64.rpm"
RPM_HASH = "af2a8effd389bca0a70568248c4709f818258212659183c1b4d50ed7a1358b435c79316f4aefb678f94a9fa453050497862357515e513f475c2ae5d7d17d209e"

RPROVIDES:${PN} += "ghc-cryptohash-md5-devel \
ghc-devel-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-md5 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
