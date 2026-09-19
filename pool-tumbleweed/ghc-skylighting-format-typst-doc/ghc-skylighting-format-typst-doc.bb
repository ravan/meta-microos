SUMMARY = "Haskell skylighting-format-typst library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-typst library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-typst-doc-0.1-1.27.noarch.rpm"
RPM_HASH = "45c95f56dfa27f20c43c2f3d1e4845d7681f67b035f3b3a52eaeb452e9289163031bb87ebeb294fa595c8b0ba19cccbabdfe455dd4477c20bb2cbeb418ed4e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-typst-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
