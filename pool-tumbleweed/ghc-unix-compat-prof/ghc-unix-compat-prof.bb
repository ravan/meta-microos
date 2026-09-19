SUMMARY = "Haskell unix-compat profiling library"
DESCRIPTION = "This package provides the Haskell unix-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.1"

RPM_NAME = "ghc-unix-compat-prof-0.7.4.1-1.9.aarch64.rpm"
RPM_HASH = "0a6d4c2cff7bd74e0c13bc5dd3e145ef7ac71cb2d00fd5fc3366f71977e66cae2b8d90fc9cdda1837505bc30d483680a0c050629c4917901056cd8fe669442d4"

RPROVIDES:${PN} += "ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-unix-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-unix-2.8.8.0-178a \
ghc-unix-compat-devel"

inherit rpm
