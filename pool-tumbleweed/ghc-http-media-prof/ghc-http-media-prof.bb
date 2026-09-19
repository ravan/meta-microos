SUMMARY = "Haskell http-media profiling library"
DESCRIPTION = "This package provides the Haskell http-media profiling library."
LICENSE = "MIT"

PV = "0.8.1.1"

RPM_NAME = "ghc-http-media-prof-0.8.1.1-3.21.aarch64.rpm"
RPM_HASH = "af2ea64e7c7f9c70b8c980e4fcbf7317028df134742ba815d728391b6f18f7e4ee338911cb35ac40b39c4bb9a74bd138a79480159e3b55109349cc9009778abf"

RPROVIDES:${PN} += "ghc-http-media-prof \
ghc-prof-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk"

RDEPENDS:${PN} += "ghc-http-media-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
