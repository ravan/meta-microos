SUMMARY = "Haskell alsa-mixer library development files"
DESCRIPTION = "This package provides the Haskell alsa-mixer library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-alsa-mixer-devel-0.3.0.1-1.20.aarch64.rpm"
RPM_HASH = "c355ecf32b94a5b2e84176cd7423608361d91941b30871fa38628ef0a6f78bb81a40c4dedd0854ab1b3686e9ab49600fbcd880af614e0d74d8d08639ac4079d3"

RPROVIDES:${PN} += "ghc-alsa-mixer-devel \
ghc-devel-alsa-mixer-0.3.0.1-ByTU73KIfiF2vSD5rVSjfR"

RDEPENDS:${PN} += "/usr/bin/sh \
alsa-devel \
ghc-alsa-mixer \
ghc-compiler \
ghc-devel-alsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-unix-2.8.8.0-178a"

inherit rpm
