SUMMARY = "Haskell polyparse library development files"
DESCRIPTION = "This package provides the Haskell polyparse library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.13.1"

RPM_NAME = "ghc-polyparse-devel-1.13.1-1.9.aarch64.rpm"
RPM_HASH = "d0a996c55a6477a327451a459580c3f3d0d01353131015527bba4506f405a73590dbe136b44352654840a5e2ef2f928909dc92ac554ee0016a634f2325c6c48d"

RPROVIDES:${PN} += "ghc-devel-polyparse-1.13.1-3ls9uCOTvHD6q0HF7GLFSI \
ghc-polyparse-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23 \
ghc-polyparse"

inherit rpm
