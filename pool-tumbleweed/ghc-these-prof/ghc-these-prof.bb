SUMMARY = "Haskell these profiling library"
DESCRIPTION = "This package provides the Haskell these profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ghc-these-prof-1.2.1-4.2.aarch64.rpm"
RPM_HASH = "decc7f823675fb577949bfcff8f191dd7e2a0ed682e2244ca3360fcbbf1e12e6109dfd7ee16e967d2e5b92be54d534def74737a102be56a6b84072707d94c704"

RPROVIDES:${PN} += "ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-these-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-these-devel"

inherit rpm
