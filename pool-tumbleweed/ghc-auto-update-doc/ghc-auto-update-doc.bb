SUMMARY = "Haskell auto-update library documentation"
DESCRIPTION = "This package provides the Haskell auto-update library documentation."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "ghc-auto-update-doc-0.2.6-1.15.noarch.rpm"
RPM_HASH = "a188c4e01bbc53deedb53df11464c365649422673992db23101bd831a7f7736927890de8ac7802212c218cbd36f6641cbfda94602fe4b7420dafa550f7f99988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-auto-update-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
