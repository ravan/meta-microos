SUMMARY = "Haskell xhtml library development files"
DESCRIPTION = "This package provides the Haskell xhtml library development files."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-devel-3000.2.2.1-1.3.aarch64.rpm"
RPM_HASH = "19a567a823fa286cb8e955488d33202843e3c6944b437ea01b059f5cceb56cbc74aa554a79e3267df68d8c9aeef50c589638ad6837eeeb52e5cf3da7cbf10567"

RPROVIDES:${PN} += "ghc-devel-xhtml-3000.2.2.1-fadd \
ghc-xhtml-devel \
ghc-xhtml-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-xhtml"

inherit rpm
