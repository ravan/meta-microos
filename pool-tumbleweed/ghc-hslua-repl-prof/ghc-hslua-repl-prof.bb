SUMMARY = "Haskell hslua-repl profiling library"
DESCRIPTION = "This package provides the Haskell hslua-repl profiling library."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-hslua-repl-prof-0.1.2-1.23.aarch64.rpm"
RPM_HASH = "48a1c6ee4312d80c4c920c2b044694096cc4ec8f938d9804d1693dbb3af6c146f545038ca46d0ca1b779c1dc1b38d419a20b2f5f0c912e0c379cef7fd2f9d2d3"

RPROVIDES:${PN} += "ghc-hslua-repl-prof \
ghc-prof-hslua-repl-0.1.2-KdgSeGpN6Tl9J954qfH0X5"

RDEPENDS:${PN} += "ghc-hslua-repl-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-isocline-1.0.9-1LtJKbO57TxJAL2UMR5S4N \
ghc-prof-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-prof-text-2.1.4-cf23"

inherit rpm
