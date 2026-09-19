SUMMARY = "Haskell terminal-size profiling library"
DESCRIPTION = "This package provides the Haskell terminal-size profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-prof-0.3.4-2.16.aarch64.rpm"
RPM_HASH = "c32b4e42174f00457484f0138132a5a6b8120a76de45ed1ec4788227aec0e02ee850b5c9f4c7392b3a17496e1d19fd7d1c34eb91db02e4bd84dffc7f384449a6"

RPROVIDES:${PN} += "ghc-prof-terminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf \
ghc-terminal-size-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-terminal-size-devel"

inherit rpm
