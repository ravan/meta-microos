SUMMARY = "Haskell IfElse library development files"
DESCRIPTION = "This package provides the Haskell IfElse library development files."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-devel-0.85-4.19.aarch64.rpm"
RPM_HASH = "dbbcb600f555902de5800fd422e4bc68ce88667e56303d8d551b4f7afa1834ea68b3210f6267ece31190420c932951f1f8c9d437b85b5102664ad7cee81309d5"

RPROVIDES:${PN} += "ghc-IfElse-devel \
ghc-devel-IfElse-0.85-2Mr7a1arQJZD9ILoSvSyef"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-IfElse \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-mtl-2.3.2-37ef"

inherit rpm
