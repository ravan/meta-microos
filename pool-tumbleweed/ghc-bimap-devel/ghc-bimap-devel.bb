SUMMARY = "Haskell bimap library development files"
DESCRIPTION = "This package provides the Haskell bimap library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-devel-0.5.0-2.23.aarch64.rpm"
RPM_HASH = "b3e5976af37d10729fb4f15ad4c325b94379ea09e089dc1b9556872f5797c8bba7ef6a90e1d2aac0b370a99bf751a90b159fbee8eb15dd354d5b3c337abe5f9e"

RPROVIDES:${PN} += "ghc-bimap-devel \
ghc-devel-bimap-0.5.0-4NSO3lF4JlF9IWsrimrxRe"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bimap \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655"

inherit rpm
