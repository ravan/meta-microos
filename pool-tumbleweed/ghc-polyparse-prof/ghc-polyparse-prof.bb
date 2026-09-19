SUMMARY = "Haskell polyparse profiling library"
DESCRIPTION = "This package provides the Haskell polyparse profiling library."
LICENSE = "LGPL-2.1-only"

PV = "1.13.1"

RPM_NAME = "ghc-polyparse-prof-1.13.1-1.9.aarch64.rpm"
RPM_HASH = "9004d692c19cf82a0992f0625b8bc2cbb7775efe8d2866af87b0dfda84ca076a80e4017f9735234de429e1e6f775d4dcada9e5d77bff0482a0e59c902c6ae187"

RPROVIDES:${PN} += "ghc-polyparse-prof \
ghc-prof-polyparse-1.13.1-3ls9uCOTvHD6q0HF7GLFSI"

RDEPENDS:${PN} += "ghc-polyparse-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23"

inherit rpm
