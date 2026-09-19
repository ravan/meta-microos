SUMMARY = "Haskell hslua-cli library development files"
DESCRIPTION = "This package provides the Haskell hslua-cli library development files."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "ghc-hslua-cli-devel-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "272349011304332d0af7ced37c493802e74aae0e4e3584c23d8495bf9c45ec9a30f2b872d2a200260f6388e033684159add7b64b58557da982cc7583a128cf17"

RPROVIDES:${PN} += "ghc-devel-hslua-cli-1.4.4-BTUlZwIBQxmCvagI4bo8Rv \
ghc-hslua-cli-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-repl-0.1.2-KdgSeGpN6Tl9J954qfH0X5 \
ghc-devel-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unix-2.8.8.0-178a \
ghc-hslua-cli"

inherit rpm
