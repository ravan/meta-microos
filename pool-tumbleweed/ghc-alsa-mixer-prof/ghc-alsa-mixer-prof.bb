SUMMARY = "Haskell alsa-mixer profiling library"
DESCRIPTION = "This package provides the Haskell alsa-mixer profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-alsa-mixer-prof-0.3.0.1-1.20.aarch64.rpm"
RPM_HASH = "d2d95894058d2d1228447347c8f75105c2a71bbb842e4c11a15101f62ea5db2ef2f865a39065a2f6dc9ebae7628c269a3d7fffe7a259bbe68de305fdcff26d32"

RPROVIDES:${PN} += "ghc-alsa-mixer-prof \
ghc-prof-alsa-mixer-0.3.0.1-ByTU73KIfiF2vSD5rVSjfR"

RDEPENDS:${PN} += "ghc-alsa-mixer-devel \
ghc-prof-alsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
