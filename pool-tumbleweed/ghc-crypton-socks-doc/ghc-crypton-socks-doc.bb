SUMMARY = "Haskell crypton-socks library documentation"
DESCRIPTION = "This package provides the Haskell crypton-socks library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-crypton-socks-doc-0.6.2-1.10.noarch.rpm"
RPM_HASH = "2e15b5a36762409bfc230adb5699c5acff4594045e3440a3a21b702f6a8fc22d74db992302689685208d0c95b80af42faa8d456d72808cd5b2cbe8a55f046879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-socks-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
