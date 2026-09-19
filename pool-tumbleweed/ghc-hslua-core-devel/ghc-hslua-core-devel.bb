SUMMARY = "Haskell hslua-core library development files"
DESCRIPTION = "This package provides the Haskell hslua-core library development files."
LICENSE = "MIT"

PV = "2.3.2.1"

RPM_NAME = "ghc-hslua-core-devel-2.3.2.1-1.3.aarch64.rpm"
RPM_HASH = "ced5fea23da9c711faab15a863a74a06f968e5affe9469a589f3c4ea84ee068ffc674a89eaaacb1a41522f398038afff52fee28ec335c773f775049951ffc2c9"

RPROVIDES:${PN} += "ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-hslua-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-core"

inherit rpm
