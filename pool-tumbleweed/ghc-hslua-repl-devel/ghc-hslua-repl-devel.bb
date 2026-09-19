SUMMARY = "Haskell hslua-repl library development files"
DESCRIPTION = "This package provides the Haskell hslua-repl library development files."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-hslua-repl-devel-0.1.2-1.23.aarch64.rpm"
RPM_HASH = "d235b3be36bbb56c1cc4e03a2f1085a219a112c1216ab0dbae6d691c815a348237e57364a0f1f9ea899b1947cd8174190619a98c93d3f4088fecba3a8ba030e3"

RPROVIDES:${PN} += "ghc-devel-hslua-repl-0.1.2-KdgSeGpN6Tl9J954qfH0X5 \
ghc-hslua-repl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-isocline-1.0.9-1LtJKbO57TxJAL2UMR5S4N \
ghc-devel-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-repl"

inherit rpm
