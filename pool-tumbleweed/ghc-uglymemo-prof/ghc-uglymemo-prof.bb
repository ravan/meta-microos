SUMMARY = "Haskell uglymemo profiling library"
DESCRIPTION = "This package provides the Haskell uglymemo profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-prof-0.1.0.1-4.19.aarch64.rpm"
RPM_HASH = "86a1b2e302cdfc4419b0b530843303c8d325f145f4711b099594e98dae54def7c39fa0a2bed4116422649c1392ca7e58fa778cfd656f4a2ef6390b1ca55327b5"

RPROVIDES:${PN} += "ghc-prof-uglymemo-0.1.0.1-7xglRopOL0Q1bomJJkVUR \
ghc-uglymemo-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-uglymemo-devel"

inherit rpm
