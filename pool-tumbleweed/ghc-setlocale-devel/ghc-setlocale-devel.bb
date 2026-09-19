SUMMARY = "Haskell setlocale library development files"
DESCRIPTION = "This package provides the Haskell setlocale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-devel-1.0.0.10-8.5.aarch64.rpm"
RPM_HASH = "53f7fb3d125f0ff9580d4df381b636f4dc8039fd3bafe9f2b28217b8b60dd82c7625c90c03064d56e6df9ee155ddb8bd9a07328497cc5a0c8eeb66ddde59c079"

RPROVIDES:${PN} += "ghc-devel-setlocale-1.0.0.10-1AxYf6FKOpjAmPtKjx6N4K \
ghc-setlocale-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-setlocale"

inherit rpm
