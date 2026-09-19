SUMMARY = "Documentation for texlive-currency"
DESCRIPTION = "This package includes the documentation for texlive-currency"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn48990"

RPM_NAME = "texlive-currency-doc-2026.226.0.0.4svn48990-61.2.noarch.rpm"
RPM_HASH = "12018fbdf0a74b8a9c7f0406ad3d6db7b0c33639364b4c41c011f30d1565fddb96397f8e2b7351e20b838df20446a0cf6ffc8b08dde5246d1a850079ad19700b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currency-doc"

RDEPENDS:${PN} += ""

inherit rpm
