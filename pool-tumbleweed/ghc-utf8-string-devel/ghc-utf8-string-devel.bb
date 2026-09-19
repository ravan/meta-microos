SUMMARY = "Haskell utf8-string library development files"
DESCRIPTION = "This package provides the Haskell utf8-string library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-devel-1.0.2-2.35.aarch64.rpm"
RPM_HASH = "9bae9bc55ef6bb0366599ff6df33aec31f53d054ac69a94a3a132d4302665393ad90a34485cddcda0898f92d11c5afdcad28d7796a129f2df9cf6e98b1a78f88"

RPROVIDES:${PN} += "ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-utf8-string-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-utf8-string"

inherit rpm
