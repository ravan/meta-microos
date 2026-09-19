SUMMARY = "Haskell kan-extensions library documentation"
DESCRIPTION = "This package provides the Haskell kan-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.2.8"

RPM_NAME = "ghc-kan-extensions-doc-5.2.8-1.3.noarch.rpm"
RPM_HASH = "65644bcc9069d1a0f50710dca6ae60c4d19615e8c7ee0670ee039183d94be4ec4380bee6a53a81e44927fe4bedf99d46bcf6257337b24a00a424d1677156fedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-kan-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
