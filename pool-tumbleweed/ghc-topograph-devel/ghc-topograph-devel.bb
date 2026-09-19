SUMMARY = "Haskell topograph library development files"
DESCRIPTION = "This package provides the Haskell topograph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ghc-topograph-devel-1.0.1-2.21.aarch64.rpm"
RPM_HASH = "745dadfd559154879a53e80dde74083a6f5ba9119cf85168c57e2d1586984048d3f7ec3f8217dc34ff14fa53f6839fa1b04044964f729f67fe702ec5a1340259"

RPROVIDES:${PN} += "ghc-devel-topograph-1.0.1-BHST0XcqM4j6FrILQ4Vv3y \
ghc-topograph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-topograph"

inherit rpm
