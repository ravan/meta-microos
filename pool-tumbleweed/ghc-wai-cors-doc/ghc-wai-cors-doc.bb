SUMMARY = "Haskell wai-cors library documentation"
DESCRIPTION = "This package provides the Haskell wai-cors library documentation."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-doc-0.2.7-1.36.noarch.rpm"
RPM_HASH = "ef0f3abca41c910b6c3b0d9979ddd5c72c4bdab8d5f71847dedc117544253e927a9c129270ef0b2f6149a700d6357c3cc68c6505440e20a80d856c2270bef8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-cors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
