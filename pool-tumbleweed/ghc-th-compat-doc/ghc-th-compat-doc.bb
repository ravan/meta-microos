SUMMARY = "Haskell th-compat library documentation"
DESCRIPTION = "This package provides the Haskell th-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-th-compat-doc-0.1.7-1.3.noarch.rpm"
RPM_HASH = "22f888d186ccc7d184267927b8161b6890b5e03207f6c2eed9ddc9fefdde1d5909fa093130c0499f1830c38b12503352f0aea9436de98c1a7dea555ac05cbc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
