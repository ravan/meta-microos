SUMMARY = "Haskell gtk2hs-buildtools library documentation"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library documentation."
LICENSE = "GPL-2.0-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-gtk2hs-buildtools-doc-0.13.12.0-1.19.noarch.rpm"
RPM_HASH = "5a0f3cf6f519a26619e4e9a46c7c014441d3373362ced27d9ea4976a13052364dbe08c67f48f0174e7575c565cd05f0c203707c2618663893d58054396ecfd64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
