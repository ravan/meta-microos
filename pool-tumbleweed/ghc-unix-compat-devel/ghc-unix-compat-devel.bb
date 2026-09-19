SUMMARY = "Haskell unix-compat library development files"
DESCRIPTION = "This package provides the Haskell unix-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.1"

RPM_NAME = "ghc-unix-compat-devel-0.7.4.1-1.9.aarch64.rpm"
RPM_HASH = "317c1a7fa8b2d25541dc50c922899ddf7f6d14a145e2ef9016e5661443a48cf582be468bb63bd527c86ef173bdb64c9ee7696d67a40764e1ec80cb43d5a9f559"

RPROVIDES:${PN} += "ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-unix-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-unix-2.8.8.0-178a \
ghc-unix-compat"

inherit rpm
