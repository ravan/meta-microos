SUMMARY = "Haskell cpphs library development files"
DESCRIPTION = "This package provides the Haskell cpphs library development files."
LICENSE = "LGPL-2.1-only"

PV = "1.20.10"

RPM_NAME = "ghc-cpphs-devel-1.20.10-1.11.aarch64.rpm"
RPM_HASH = "e174042a9df86c9861fa6b61a31dc50cb6db1d1264fbeea02bab5462eafd84705ab1a15150b795df8b9812da5f419796c9cb74a6c3660bd5ac923b35274a89b9"

RPROVIDES:${PN} += "ghc-cpphs-devel \
ghc-devel-cpphs-1.20.10-CewphWkQP3qH9WB1ikGBAW"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cpphs \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-polyparse-1.13.1-3ls9uCOTvHD6q0HF7GLFSI \
ghc-devel-time-1.14-a7dc"

inherit rpm
