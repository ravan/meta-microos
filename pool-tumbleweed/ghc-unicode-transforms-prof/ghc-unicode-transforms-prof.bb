SUMMARY = "Haskell unicode-transforms profiling library"
DESCRIPTION = "This package provides the Haskell unicode-transforms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-prof-0.4.0.1-10.3.aarch64.rpm"
RPM_HASH = "b5d725995e36d6e52c700896fe6cf29eb5a9f1c4de35da64381577b579efb954844ed94e29975c7c70e903327a85e1b9f624ca209e0c7425032416743e3d788e"

RPROVIDES:${PN} += "ghc-prof-unicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI \
ghc-unicode-transforms-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-unicode-transforms-devel"

inherit rpm
