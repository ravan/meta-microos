SUMMARY = "Haskell file-embed profiling library"
DESCRIPTION = "This package provides the Haskell file-embed profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.16.0"

RPM_NAME = "ghc-file-embed-prof-0.0.16.0-1.19.aarch64.rpm"
RPM_HASH = "2721fbd0f3f15b848ed0fbb0be5d5efc3c8c21efafd531b75427a4614648c2e323e8faeb975f6daf0259049a28f06976f74c17af75817c9ac7838015d12bc557"

RPROVIDES:${PN} += "ghc-file-embed-prof \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn"

RDEPENDS:${PN} += "ghc-file-embed-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-template-haskell-2.23.0.0-358a"

inherit rpm
