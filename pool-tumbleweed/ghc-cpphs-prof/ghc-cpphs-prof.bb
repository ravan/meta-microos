SUMMARY = "Haskell cpphs profiling library"
DESCRIPTION = "This package provides the Haskell cpphs profiling library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.10"

RPM_NAME = "ghc-cpphs-prof-1.20.10-1.11.aarch64.rpm"
RPM_HASH = "d05aa5c38dbd8b2909e0bc33d7e13be305f57c4d2b13e3f9ca1ce17350e8f93281cb63d51de4773173096db95f12d731b18146059cb6829e483f0fbc4cf4af9d"

RPROVIDES:${PN} += "ghc-cpphs-prof \
ghc-prof-cpphs-1.20.10-CewphWkQP3qH9WB1ikGBAW"

RDEPENDS:${PN} += "ghc-cpphs-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-polyparse-1.13.1-3ls9uCOTvHD6q0HF7GLFSI \
ghc-prof-time-1.14-a7dc"

inherit rpm
