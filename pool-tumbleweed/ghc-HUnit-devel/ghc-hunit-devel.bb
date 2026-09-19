SUMMARY = "Haskell HUnit library development files"
DESCRIPTION = "This package provides the Haskell HUnit library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-devel-1.6.2.0-2.35.aarch64.rpm"
RPM_HASH = "db57a9ccbcc30fc3f1cd46da049c710c27b3633209f096297efc893b94fafca59fba5f979a47c3f3a418dbdd8041ee8c36fb1020019317914f52f881a2b53379"

RPROVIDES:${PN} += "ghc-HUnit-devel \
ghc-devel-HUnit-1.6.2.0-HyPyPtOZKKe7vLdGCWHz7V"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HUnit \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-devel-deepseq-1.5.1.0-1350"

inherit rpm
