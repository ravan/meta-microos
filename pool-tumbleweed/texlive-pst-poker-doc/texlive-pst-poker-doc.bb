SUMMARY = "Documentation for texlive-pst-poker"
DESCRIPTION = "This package includes the documentation for texlive-pst-poker"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.04asvn75726"

RPM_NAME = "texlive-pst-poker-doc-2026.226.0.0.04asvn75726-60.4.noarch.rpm"
RPM_HASH = "89a1ad0a5c0bdd44bb7b3c8a7ba9855cc606f394945d4b0ce9076e0e71da536a191633436597899683f5b2a2fdb1ced5f80a8001f112dfc25374335bf806c070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poker-doc"

RDEPENDS:${PN} += ""

inherit rpm
