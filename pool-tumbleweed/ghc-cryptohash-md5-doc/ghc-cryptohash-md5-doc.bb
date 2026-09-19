SUMMARY = "Haskell cryptohash-md5 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-doc-0.11.101.0-8.15.noarch.rpm"
RPM_HASH = "6feaa88d742f473fcf00926c5d38706d2c25351315a1f54d076e93404acf2f0e1064becc0d01c3c6b65042b06bb064cbf3141d99fd41fbabab13aacef521af91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-md5-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
