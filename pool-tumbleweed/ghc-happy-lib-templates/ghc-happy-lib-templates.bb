SUMMARY = "Shared datafiles needed at run-time by both ghc-happy-lib and happy"
DESCRIPTION = "Shared datafiles that are required by both ghc-happy-lib and happy at run-time."
LICENSE = "BSD-2-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-happy-lib-templates-2.1.7-1.9.noarch.rpm"
RPM_HASH = "f94de1b2e8b4c4f9005d6089a5794b10856d2e6f81905e5d28c7dfb9c2c887fb5ba7d4b66349925218d57aca81526d7388f87f1d8841f1e73d859058c7f9317f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-happy-lib-templates"

RDEPENDS:${PN} += ""

inherit rpm
