SUMMARY = "Haskell xml-types profiling library"
DESCRIPTION = "This package provides the Haskell xml-types profiling library."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-prof-0.3.8-4.23.aarch64.rpm"
RPM_HASH = "4807aa3862cab7c591e6c17d838205addc12bc022cc57b70a138d214cd5ae4ddc66b4a23c1bf6ee0b5a5af1699d26bd5fb32b720c90ba577ef65b32b77642b0e"

RPROVIDES:${PN} += "ghc-prof-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-xml-types-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-text-2.1.4-cf23 \
ghc-xml-types-devel"

inherit rpm
