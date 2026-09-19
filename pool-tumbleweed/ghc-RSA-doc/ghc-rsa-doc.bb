SUMMARY = "Haskell RSA library documentation"
DESCRIPTION = "This package provides the Haskell RSA library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ghc-RSA-doc-2.4.1-1.28.noarch.rpm"
RPM_HASH = "acd8a08ba9be5bbe7afba6c3057c5b3797164813398261506a5110b1b99a5d8c24edfbc1541ffca1a73a0cef0f3f8096f84aaaa139dab106d5e6ce46ba636ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-RSA-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
