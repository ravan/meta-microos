SUMMARY = "Haskell terminfo library documentation"
DESCRIPTION = "This package provides the Haskell terminfo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.7"

RPM_NAME = "ghc-terminfo-doc-0.4.1.7-1.3.noarch.rpm"
RPM_HASH = "ad8d63a34a66f393dacd7c680e09b7dea998c1928fd82a3965c222faa61c738ec0a647cc14a11bd3c8329f7d4af79f74dea54dd9b04adc7ab88cc352711ea271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminfo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
