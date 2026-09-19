SUMMARY = "Haskell base-unicode-symbols library documentation"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-doc-0.2.4.2-1.23.noarch.rpm"
RPM_HASH = "1a7b4689aeb65c2c9922365fb89857e2a05cc949ef0a4876734b5f46300e64fe715e7e6955166212d2b86fe4b649a47685b75251768c3afcf3ba24a80c8769ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
