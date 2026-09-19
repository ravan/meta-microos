SUMMARY = "Haskell comonad library development files"
DESCRIPTION = "This package provides the Haskell comonad library development files."
LICENSE = "BSD-2-Clause"

PV = "5.0.10"

RPM_NAME = "ghc-comonad-devel-5.0.10-1.3.aarch64.rpm"
RPM_HASH = "3999fc44d70fd4d206ba7ba8bd27f54c6f6dd7b9466bb3cf0a8d53b8cfe643c08a98e7a0813f7f3024729d5032d4c1a37b7b916b0f28fae6465012d36197bb95"

RPROVIDES:${PN} += "ghc-comonad-devel \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-comonad \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
