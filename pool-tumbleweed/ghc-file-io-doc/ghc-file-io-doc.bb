SUMMARY = "Haskell file-io library documentation"
DESCRIPTION = "This package provides the Haskell file-io library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-file-io-doc-0.1.6-1.3.noarch.rpm"
RPM_HASH = "9643061a5961abc9bcc169f6c7f01db54cfdaf3739605553f7ce2348d2f94b041a265af53240011f14aabcb663b2a5157b2395cf443bb0f6915d991720f0b25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-file-io-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
